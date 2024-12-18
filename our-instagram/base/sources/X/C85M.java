package X;

import android.content.Context;
import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.instagram.common.session.UserSession;

/* renamed from: X.85M, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C85M {
    public int A00;
    public AbstractC203508z9 A01;
    public InterfaceC203488z7 A02;
    public String A03;
    public C193208h0 A04;
    public final C85O A05;
    public final Context A06;
    public final UserSession A07;

    /* JADX WARN: Removed duplicated region for block: B:151:0x02d5 A[Catch: Exception -> 0x02d9, TRY_LEAVE, TryCatch #0 {Exception -> 0x02d9, blocks: (B:16:0x0020, B:19:0x0028, B:22:0x0062, B:24:0x009c, B:26:0x00d9, B:28:0x00e4, B:30:0x00ff, B:31:0x0104, B:32:0x0105, B:35:0x010c, B:37:0x0114, B:39:0x0117, B:41:0x011e, B:43:0x0124, B:46:0x012b, B:48:0x0133, B:52:0x013a, B:55:0x0149, B:57:0x015d, B:59:0x0166, B:65:0x0173, B:67:0x0187, B:69:0x018a, B:71:0x0193, B:73:0x01a0, B:75:0x01c4, B:78:0x01d1, B:81:0x01d9, B:84:0x01ec, B:90:0x0200, B:92:0x0204, B:94:0x0207, B:97:0x021c, B:99:0x0242, B:101:0x0247, B:103:0x024c, B:110:0x0258, B:112:0x025e, B:114:0x026d, B:117:0x0270, B:122:0x02a8, B:124:0x027c, B:135:0x028c, B:137:0x0292, B:139:0x02a2, B:142:0x02a5, B:145:0x02b6, B:147:0x02ba, B:148:0x02c0, B:149:0x02d1, B:151:0x02d5), top: B:15:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85M.A00():void");
    }

    public C85M(Context context, UserSession userSession) {
        this.A06 = context;
        this.A07 = userSession;
        C85O c85o = new C85O(new C85N(context, userSession), "saliency");
        this.A05 = c85o;
        this.A00 = -1;
        if (this.A03 == null) {
            c85o.A00(new C85Q() { // from class: X.85P
                @Override // X.C85Q
                public final void D6S(C1825788b c1825788b, Exception exc) {
                    if (c1825788b != null) {
                        C85M c85m = C85M.this;
                        ModelPathsHolder modelPathsHolder = (ModelPathsHolder) c1825788b.A00.get(VersionedCapability.Saliency);
                        if (modelPathsHolder != null) {
                            c85m.A03 = modelPathsHolder.getModelPath(EnumC1825988f.A0W);
                        }
                    }
                }
            });
        }
    }
}
