package X;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* renamed from: X.OwE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56148OwE implements InterfaceC25601Mq {
    @Override // X.InterfaceC25601Mq
    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        BufferedReader bufferedReader;
        C3JY c3jy = (C3JY) obj;
        C14360o3.A0B(c3jy, 0);
        InterfaceC26481Qd A00 = c3jy.A00();
        String str = null;
        if (A00 != null) {
            try {
                InputStream AjT = A00.AjT();
                try {
                    C14360o3.A0A(AjT);
                    Reader inputStreamReader = new InputStreamReader(AjT, C15W.A05);
                    if (inputStreamReader instanceof BufferedReader) {
                        bufferedReader = (BufferedReader) inputStreamReader;
                    } else {
                        bufferedReader = new BufferedReader(inputStreamReader, 8192);
                    }
                    try {
                        str = AbstractC38581qm.A00(bufferedReader);
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        AjT.close();
                        A00.close();
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        }
        C52085N2l c52085N2l = new C52085N2l(str);
        c52085N2l.mStatusCode = c3jy.A02;
        return c52085N2l;
    }
}
