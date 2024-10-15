package io.github.vvb2060.keyattestation;

import io.github.vvb2060.keyattestation.attestation.RootOfTrust;
import android.util.Log;

public class ExtractBootHash {
    public static void main(String[] args) throws Exception {
        // Access the RootOfTrust class
        RootOfTrust rootOfTrust = new RootOfTrust();  // Modify based on constructor needs

        // Get the VerifiedBootHash
        byte[] verifiedBootHash = rootOfTrust.getVerifiedBootHash();

        // Convert byte array to hex string and log it
        String bootHashHex = bytesToHex(verifiedBootHash);
        Log.d("ExtractBootHash", "Verified Boot Hash: " + bootHashHex);
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
