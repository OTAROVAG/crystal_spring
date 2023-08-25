package rabbitmqConsumer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Alfa
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomMessage {
    private String message;
    private String src_op_id;
    private boolean success;

 
    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the src_op_id
     */
    public String getSrc_op_id() {
        return src_op_id;
    }

    /**
     * @param src_op_id the src_op_id to set
     */
    public void setSrc_op_id(String src_op_id) {
        this.src_op_id = src_op_id;
    }

    /**
     * @return the success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * @param success the success to set
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }
}
