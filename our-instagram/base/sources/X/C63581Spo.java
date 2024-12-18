package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.work.multiprocess.RemoteListenableWorker;
import androidx.work.multiprocess.parcelable.ParcelableResult;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Spo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63581Spo implements C1N8 {
    public final int A00;
    public final Object A01;

    public C63581Spo(int i, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = i;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.C1N8
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        R1X A0E;
        R0K A0H;
        R0J A0G;
        C60474R0a A0E2;
        QWE A0E3;
        QWW A0L;
        R1S A0E4;
        QWN A0E5;
        R1O A0E6;
        QRZ A0E7;
        C2JS A03;
        C2JS A02;
        switch (this.A00) {
            case 0:
                ParcelableResult parcelableResult = (ParcelableResult) SQY.A00(ParcelableResult.CREATOR, (byte[]) obj);
                C48442Kl.A00();
                C62951SYt c62951SYt = ((RemoteListenableWorker) this.A01).A02;
                synchronized (c62951SYt.A02) {
                    ServiceConnectionC63446SkP serviceConnectionC63446SkP = c62951SYt.A00;
                    if (serviceConnectionC63446SkP != null) {
                        c62951SYt.A01.unbindService(serviceConnectionC63446SkP);
                        c62951SYt.A00 = null;
                    }
                }
                return parcelableResult.A00;
            case 1:
                return this.A01;
            case 2:
            default:
                return ((InterfaceC16660sJ) this.A01).invoke(obj);
            case 3:
                R0L r0l = (R0L) obj;
                if (r0l == null || (A0E = r0l.A0E()) == null) {
                    return null;
                }
                R0I A0F = A0E.A0F();
                if ((A0F == null || (A0E6 = A0F.A0E()) == null || (A0E7 = A0E6.A0E()) == null || (A0L = AbstractC58322PtE.A0L(A0E7)) == null) && (((A0H = A0E.A0H()) == null || (A0E4 = A0H.A0E()) == null || (A0E5 = A0E4.A0E()) == null || (A0L = AbstractC58322PtE.A0L(A0E5)) == null) && ((A0G = A0E.A0G()) == null || (A0E2 = A0G.A0E()) == null || (A0E3 = A0E2.A0E()) == null || (A0L = AbstractC58322PtE.A0L(A0E3)) == null))) {
                    return null;
                }
                break;
            case 4:
                return C63147Sdt.A01((R0L) obj);
            case 5:
                return T2N.A02((R0L) obj);
            case 6:
                C2JS c2js = (C2JS) obj;
                if (c2js == null || (A03 = c2js.A03(C59034QUs.class, "init_link_paypal(input:$input)", 1339402409)) == null || (A02 = A03.A02(C59033QUr.class, "payments_error", -190649136)) == null || (A0L = AbstractC58322PtE.A0L(A02)) == null) {
                    return null;
                }
                break;
            case 7:
                return AbstractC62189S1k.A00((C62731SNv) obj);
            case 8:
                return ((C62580SHf) this.A01).A03.A00((C62731SNv) obj);
            case 9:
                return C60622REh.A00((C62731SNv) obj, ((C62580SHf) this.A01).A03.A00, new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IGFBPayOrderInfoSectionQuery", AbstractC25225BEi.A0b().getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C59875QqL.class, false, null, 0, null, "fbpay_account_extended", AbstractC166987dD.A1E()), S9E.A00);
            case 10:
                return C60622REh.A00((C62731SNv) obj, ((SE6) this.A01).A01.A00, new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "ShowConnectFBPayQuery", AbstractC25225BEi.A0b().getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C59964Qrm.class, false, null, 0, null, "transaction_hub_metadata", AbstractC166987dD.A1E()), T7p.A00);
            case 11:
                C62521SEx c62521SEx = ((SE7) this.A01).A01;
                C40701ud c40701ud = c62521SEx.A01;
                C2JM A0b = AbstractC25225BEi.A0b();
                C2JM A0b2 = AbstractC25225BEi.A0b();
                A0b.A03("first", 4);
                return C60622REh.A00((C62731SNv) obj, c40701ud, new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IgFbPayOrdersQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), R19.class, false, null, 0, null, "me", AbstractC166987dD.A1E()), new C64285T7u(c62521SEx.A00, 7));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return AbstractC166997dE.A0b();
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return Boolean.valueOf(((C63152Se0) obj).A08.containsKey("BIO"));
            case 14:
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    return bitmap;
                }
                C56256Oy3 c56256Oy3 = (C56256Oy3) this.A01;
                Canvas canvas = new Canvas(bitmap);
                Bitmap bitmap2 = c56256Oy3.A00;
                if (bitmap2 == null) {
                    return bitmap;
                }
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                return bitmap;
        }
        return AbstractC63238Sfs.A03(A0L);
    }

    public C63581Spo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public C63581Spo(C63346Si2 c63346Si2, int i) {
        this.A00 = i;
        this.A01 = c63346Si2;
    }
}
