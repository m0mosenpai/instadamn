package X;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* renamed from: X.SgK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63261SgK {
    public static final Logger A00 = AbstractC58319PtB.A17(C63261SgK.class);

    public static TWb A00(Socket socket) {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                C65167Teg c65167Teg = new C65167Teg(socket);
                OutputStream outputStream = socket.getOutputStream();
                if (outputStream != null) {
                    return new TWb(c65167Teg, new C64836TWc(outputStream, c65167Teg));
                }
                throw AbstractC166987dD.A12("out == null");
            }
            throw MSW.A0y("socket's output stream == null");
        }
        throw AbstractC166987dD.A12("socket == null");
    }

    public static C64844TWk A01(Socket socket) {
        if (socket != null) {
            if (socket.getInputStream() != null) {
                C65167Teg c65167Teg = new C65167Teg(socket);
                InputStream inputStream = socket.getInputStream();
                if (inputStream != null) {
                    return new C64844TWk(c65167Teg, new C64845TWl(inputStream, c65167Teg));
                }
                throw AbstractC166987dD.A12("in == null");
            }
            throw MSW.A0y("socket's input stream == null");
        }
        throw AbstractC166987dD.A12("socket == null");
    }
}
