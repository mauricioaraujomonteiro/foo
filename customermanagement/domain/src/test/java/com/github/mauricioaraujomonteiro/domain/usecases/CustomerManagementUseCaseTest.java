//package com.github.mauricioaraujomonteiro.domain.usecases;
//
//import com.github.mauricioaraujomonteiro.domain.data.UserDTO;
//import com.github.mauricioaraujomonteiro.domain.exception.BusinessLogicException;
//import com.github.mauricioaraujomonteiro.domain.port.spi.UserPersistencePort;
//import com.github.mauricioaraujomonteiro.domain.services.ValidationService;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//
//import java.util.Optional;
//
//public class CustomerManagementUseCaseTest {
//
//    private UserPersistencePort userPersistencePort = Mockito.mock(UserPersistencePort.class);
//    private ValidationService validationService = new ValidationService();
//
//    private CustomerManagementUseCase customerManagementUseCase = new CustomerManagementUseCase(userPersistencePort, validationService);
//
//    @Test
//    public void testShouldSaveCustomer() {
//
//        UserDTO userDTO = UserDTO.builder()
//                .name("USERNAME")
//                .lastName("lastName")
//                .email("email@email.com")
//                .build();
//
//        Mockito.when(userPersistencePort.save(userDTO)).thenReturn(Optional.of(userDTO));
//
//        boolean isSaved = customerManagementUseCase.save(userDTO);
//
//        Assertions.assertTrue(isSaved);
//
//    }
//
//    @Test
//    public void testShouldNotSaveCustomerWithEmptyEmail() {
//
//        UserDTO userDTO = UserDTO.builder()
//                .name("USERNAME")
//                .lastName("lastName")
//                .email("")
//                .build();
//
//        Assertions.assertThrows(BusinessLogicException.class, () -> {
//            customerManagementUseCase.save(userDTO);
//        });
//
//
//    }
//
//    @Test
//    public void testShouldNotSaveCustomerWithInvalidEmail() {
//
//        UserDTO userDTO = UserDTO.builder()
//                .name("USERNAME")
//                .lastName("lastName")
//                .email("invalid")
//                .build();
//
//        Assertions.assertThrows(BusinessLogicException.class, () -> {
//            customerManagementUseCase.save(userDTO);
//        });
//
//    }
//
//    @Test
//    public void testShouldNotSaveCustomerWithNullEmail() {
//
//        UserDTO userDTO = UserDTO.builder()
//                .name("USERNAME")
//                .lastName("lastName")
//                .build();
//
//        Assertions.assertThrows(BusinessLogicException.class, () -> {
//            customerManagementUseCase.save(userDTO);
//        });
//    }
//
//    @Test
//    public void testShouldNotSaveCustomerWithEmptyName() {
//
//        UserDTO userDTO = UserDTO.builder()
//                .name("")
//                .lastName("lastName")
//                .email("something@gmail.com")
//                .build();
//
//        Assertions.assertThrows(BusinessLogicException.class, () -> {
//            customerManagementUseCase.save(userDTO);
//        });
//
//    }
//
//    @Test
//    public void testShouldNotSaveCustomerWithNullName() {
//
//        UserDTO userDTO = UserDTO.builder()
//                .lastName("lastName")
//                .email("something@gmail.com")
//                .build();
//
//        Assertions.assertThrows(BusinessLogicException.class, () -> {
//            customerManagementUseCase.save(userDTO);
//        });
//    }
//
//    @Test
//    public void testShouldNotSaveCustomerWithEmptylastName() {
//
//        UserDTO userDTO = UserDTO.builder()
//                .name("name")
//                .lastName("")
//                .email("something@gmail.com")
//                .build();
//
//        Assertions.assertThrows(BusinessLogicException.class, () -> {
//            customerManagementUseCase.save(userDTO);
//        });
//
//    }
//
//    @Test
//    public void testShouldNotSaveCustomerWithNulllastName() {
//
//        UserDTO userDTO = UserDTO.builder()
//                .name("name")
//                .email("something@gmail.com")
//                .build();
//
//        Assertions.assertThrows(BusinessLogicException.class, () -> {
//            customerManagementUseCase.save(userDTO);
//        });
//
//    }
//}
