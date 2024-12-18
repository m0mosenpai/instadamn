package X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.File;
import java.util.List;

/* loaded from: classes4.dex */
public final class APL implements Handler.Callback {
    public static volatile Handler A00;

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.BCQ r13, X.A6X r14, X.A6Y r15, byte[] r16) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.APL.A02(X.BCQ, X.A6X, X.A6Y, byte[]):void");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Handler$Callback, java.lang.Object] */
    public static synchronized Handler A00() {
        Handler handler;
        synchronized (APL.class) {
            if (A00 == null) {
                A00 = new Handler(Looper.getMainLooper(), new Object());
            }
            handler = A00;
        }
        return handler;
    }

    public static Object[] A0B(Message message) {
        Object obj = message.obj;
        obj.getClass();
        return (Object[]) obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Handler A002;
        Object[] objArr;
        int i;
        switch (message.what) {
            case 1:
                A08((List) message.obj);
                return false;
            case 2:
                A09((List) message.obj);
                return false;
            case 3:
                Object[] A0B = A0B(message);
                A07((Exception) A0B[0], (List) A0B[1]);
                return false;
            case 4:
                Object[] A0B2 = A0B(message);
                List list = (List) A0B2[0];
                A06((InterfaceC175017qb) A0B2[3], (String) A0B2[1], (String) A0B2[2], list);
                return false;
            case 5:
                Object[] A0B3 = A0B(message);
                A01((Bitmap) A0B3[1], (BCQ) A0B3[0], (A6X) A0B3[2], (A6Y) A0B3[3]);
                return false;
            case 6:
                Object[] A0B4 = A0B(message);
                A02((BCQ) A0B4[0], (A6X) A0B4[2], (A6Y) A0B4[3], (byte[]) A0B4[1]);
                return false;
            case 7:
                objArr = null;
                if (A0A()) {
                    objArr.getClass();
                    throw C00O.createAndThrow();
                }
                A002 = A00();
                i = 7;
                break;
            case 8:
                Object[] A0B5 = A0B(message);
                BCQ bcq = (BCQ) A0B5[0];
                Exception exc = (Exception) A0B5[1];
                if (A0A()) {
                    bcq.D2G();
                    return false;
                }
                AbstractC166997dE.A1H(A00(), new Object[]{bcq, exc}, 8);
                return false;
            case 9:
                Object[] A0B6 = A0B(message);
                A03((BCQ) A0B6[0], (Exception) A0B6[1]);
                return false;
            case 10:
                Object[] A0B7 = A0B(message);
                BD8 bd8 = (BD8) A0B7[0];
                ACI aci = (ACI) A0B7[1];
                if (A0A()) {
                    bd8.DdV(aci);
                    return false;
                }
                AbstractC166997dE.A1H(A00(), new Object[]{bd8, aci}, 10);
                return false;
            case 11:
                Object[] A0B8 = A0B(message);
                BD8 bd82 = (BD8) A0B8[0];
                ACI aci2 = (ACI) A0B8[1];
                if (A0A()) {
                    bd82.DdY(aci2);
                    return false;
                }
                AbstractC166997dE.A1H(A00(), new Object[]{bd82, aci2}, 11);
                return false;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                Object[] A0B9 = A0B(message);
                A04((BD8) A0B9[0], (Exception) A0B9[1]);
                return false;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                Object[] A0B10 = A0B(message);
                Object obj = A0B10[0];
                double doubleValue = ((Number) A0B10[1]).doubleValue();
                if (!A0A()) {
                    A002 = A00();
                    objArr = new Object[]{obj, Double.valueOf(doubleValue)};
                    i = 13;
                    break;
                }
                return false;
            case 14:
                Object[] A0B11 = A0B(message);
                A05((C22813A4g) A0B11[0], (File) A0B11[1], (Exception) A0B11[2]);
                return false;
            case Process.SIGTERM /* 15 */:
                Object[] A0B12 = A0B(message);
                Object obj2 = A0B12[1];
                Object obj3 = A0B12[2];
                if (A0A()) {
                    if (obj2 != null) {
                        throw AbstractC166987dD.A15("onPostViewReady");
                    }
                    return false;
                }
                A002 = A00();
                objArr = new Object[]{null, obj2, obj3};
                i = 15;
                break;
            case 16:
                Object obj4 = A0B(message)[0];
                if (!A0A()) {
                    A002 = A00();
                    objArr = new Object[]{obj4};
                    i = 16;
                    break;
                }
                return false;
            case 17:
                Object obj5 = A0B(message)[0];
                if (!A0A()) {
                    A002 = A00();
                    objArr = new Object[]{obj5};
                    i = 17;
                    break;
                }
                return false;
            default:
                return false;
        }
        A002.sendMessage(A002.obtainMessage(i, objArr));
        return false;
    }

    public static void A01(Bitmap bitmap, BCQ bcq, A6X a6x, A6Y a6y) {
        if (A0A()) {
            if (bcq instanceof BEH) {
                ((BEH) bcq).Czc(bitmap);
            } else if (bcq instanceof C23318AVd) {
                ((C23318AVd) bcq).A00(bitmap, a6x);
            } else {
                throw AbstractC166987dD.A18("Callback instance must be either PhotoBitmapCallback or PhotoBitmapInfoCallback");
            }
            if (a6y != null) {
                a6y.A00.A06.BAu("Lite-Controller-Thread").post(a6y.A01);
                return;
            }
            return;
        }
        AbstractC166997dE.A1H(A00(), new Object[]{bcq, bitmap, a6x, a6y}, 5);
    }

    public static void A03(BCQ bcq, Exception exc) {
        if (A0A()) {
            bcq.D2I(exc);
        } else {
            AbstractC166997dE.A1H(A00(), new Object[]{bcq, exc}, 9);
        }
    }

    public static void A04(BD8 bd8, Exception exc) {
        if (A0A()) {
            bd8.DdW(exc);
        } else {
            AbstractC166997dE.A1H(A00(), new Object[]{bd8, exc}, 12);
        }
    }

    public static void A05(C22813A4g c22813A4g, File file, Exception exc) {
        if (A0A()) {
            if (exc == null) {
                C14360o3.A0B(file, 0);
                return;
            }
            return;
        }
        AbstractC166997dE.A1H(A00(), new Object[]{c22813A4g, file, exc}, 14);
    }

    public static void A06(InterfaceC175017qb interfaceC175017qb, String str, String str2, List list) {
        if (!A0A()) {
            AbstractC166997dE.A1H(A00(), new Object[]{list, str, str2, interfaceC175017qb}, 4);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            ((BDZ) list.get(i)).D1X(str, str2);
        }
        if (interfaceC175017qb == null) {
            return;
        }
        interfaceC175017qb.D1T(0L, str, str2);
    }

    public static void A07(Exception exc, List list) {
        if (!A0A()) {
            AbstractC166997dE.A1H(A00(), new Object[]{exc, list}, 3);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            ((BDZ) list.get(i)).D1S(exc);
        }
    }

    public static void A08(List list) {
        if (A0A()) {
            list.getClass();
            for (int i = 0; i < list.size(); i++) {
                ((BDZ) list.get(i)).D1W();
            }
            return;
        }
        AbstractC166997dE.A1H(A00(), list, 1);
    }

    public static void A09(List list) {
        if (A0A()) {
            list.getClass();
            for (int i = 0; i < list.size(); i++) {
                ((BDZ) list.get(i)).D1b();
            }
            return;
        }
        AbstractC166997dE.A1H(A00(), list, 2);
    }

    public static boolean A0A() {
        return AbstractC167007dF.A1X(Looper.getMainLooper().getThread(), Thread.currentThread());
    }
}
