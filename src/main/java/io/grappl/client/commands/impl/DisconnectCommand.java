package io.grappl.client.commands.impl;

import io.grappl.client.ClientLog;
import io.grappl.client.api.Grappl;
import io.grappl.client.commands.Command;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class DisconnectCommand implements Command {

    public void runCommand(Grappl grappl, DataInputStream dataInputStream, DataOutputStream dataOutputStream) {
        ClientLog.log("Disconnecting...");
        grappl.disconnect();
    }
}