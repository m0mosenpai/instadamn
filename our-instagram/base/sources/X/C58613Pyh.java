package X;

import com.google.common.io.Closeables;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Vector;

/* renamed from: X.Pyh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58613Pyh implements InterfaceC26421Px {
    public static final char[] A05;
    public InterfaceC65613To4 A00;
    public final InterfaceC65527Tlw A01;
    public final List A02 = AbstractC58318PtA.A11();
    public final C23781El A03;
    public final InterfaceC65527Tlw A04;

    @Override // X.InterfaceC26421Px
    public final C23781El Aqy() {
        return null;
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        C14360o3.A07(charArray);
        A05 = charArray;
    }

    public final void A00(InterfaceC65673Tr3 interfaceC65673Tr3, String str) {
        List list = this.A02;
        list.add(this.A01);
        list.add(new C58612Pyg("Content-Disposition: form-data; name=\"", str, "\"; filename=\"", interfaceC65673Tr3.getName(), "\"", "\r\n", "Content-Type: ", interfaceC65673Tr3.getContentType(), "\r\n", "Content-Transfer-Encoding: binary", "\r\n", "\r\n"));
        list.add(interfaceC65673Tr3);
        list.add(new C58612Pyg("\r\n"));
    }

    @Override // X.InterfaceC26421Px
    public final C23781El Ar8() {
        return this.A03;
    }

    @Override // X.InterfaceC26421Px
    public final long getContentLength() {
        Iterator it = this.A02.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((InterfaceC65527Tlw) it.next()).Ch9();
        }
        return j + this.A04.Ch9();
    }

    public C58613Pyh() {
        InterfaceC65613To4 interfaceC65613To4 = InterfaceC65613To4.A00;
        this.A00 = interfaceC65613To4;
        StringBuilder A1C = AbstractC166987dD.A1C();
        Random random = new Random();
        int i = 0;
        do {
            char[] cArr = A05;
            A1C.append(cArr[random.nextInt(cArr.length)]);
            i++;
        } while (i < 30);
        String A19 = AbstractC166987dD.A19(A1C);
        this.A03 = new C23781El("Content-Type", AnonymousClass001.A0R("multipart/form-data; boundary=", A19));
        this.A01 = new C58612Pyg("--", A19, "\r\n");
        this.A04 = new C58612Pyg("--", A19, "--", "\r\n");
        this.A00 = interfaceC65613To4;
    }

    @Override // X.InterfaceC26421Px
    public final InputStream E2i() {
        long contentLength = getContentLength();
        InterfaceC65613To4 interfaceC65613To4 = this.A00;
        long j = 0;
        interfaceC65613To4.onBytesTransferred(0L, contentLength);
        Vector vector = new Vector();
        try {
            for (InterfaceC65527Tlw interfaceC65527Tlw : this.A02) {
                vector.add(interfaceC65527Tlw.E2i());
                j += interfaceC65527Tlw.Ch9();
            }
            InterfaceC65527Tlw interfaceC65527Tlw2 = this.A04;
            vector.add(interfaceC65527Tlw2.E2i());
            return new C58611Pye(interfaceC65613To4, new SequenceInputStream(vector.elements()), j + interfaceC65527Tlw2.Ch9());
        } catch (IOException e) {
            Iterator A13 = AbstractC166997dE.A13(vector);
            while (A13.hasNext()) {
                Closeables.A01((InputStream) A13.next());
            }
            throw e;
        }
    }
}
