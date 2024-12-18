package X;

import android.content.Intent;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.iabadscontext.IABAdsBwIntegrationExtension;
import com.facebook.iabadscontext.IABAdsContext;

/* renamed from: X.SZi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62965SZi {
    public static int A03;
    public static C62965SZi A04;
    public static String A05;
    public InterfaceC65583TnM A00;
    public QIz A01;
    public final SFZ A02 = new SFZ();

    public static final C62965SZi A00(Intent intent) {
        C14360o3.A0B(intent, 0);
        C62965SZi c62965SZi = A04;
        if (c62965SZi == null) {
            intent.hashCode();
            A03 = intent.hashCode();
            c62965SZi = new C62965SZi(intent);
        }
        if (A03 != intent.hashCode() && A04 != null) {
            intent.hashCode();
            A03 = intent.hashCode();
            c62965SZi = new C62965SZi(intent);
        }
        if (!C14360o3.A0K(A04, c62965SZi)) {
            A04 = c62965SZi;
        }
        return c62965SZi;
    }

    public final boolean A01() {
        if (this.A01.A01 != C05F.A0N && !A02()) {
            return false;
        }
        return true;
    }

    public final boolean A02() {
        if (this.A00.CR0() && this.A01.A01 == C05F.A01) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.TnM, java.lang.Object] */
    public C62965SZi(Intent intent) {
        long j;
        InterfaceC65583TnM c63933Sw8;
        this.A00 = new Object();
        Integer num = C05F.A00;
        this.A01 = new QIz(num, num, (Long) null, (String) null, (String) null, (String) null, (String) null);
        IabCommonTrait iabCommonTrait = (IabCommonTrait) intent.getParcelableExtra("EXTRA_IAB_CONTEXT");
        if (iabCommonTrait != null && (iabCommonTrait instanceof IABAdsContext)) {
            IABAdsBwIntegrationExtension iABAdsBwIntegrationExtension = ((IABAdsContext) iabCommonTrait).A00;
            if (iABAdsBwIntegrationExtension == null) {
                AbstractC63254SgB.A02("BwIContext", "Null BwI Extension!", new Object[0]);
                return;
            }
            Integer num2 = iABAdsBwIntegrationExtension.A01;
            if (num2 == num || num2 == C05F.A0C) {
                return;
            }
            QIz qIz = new QIz(iABAdsBwIntegrationExtension);
            this.A01 = qIz;
            SFZ sfz = this.A02;
            Integer num3 = iABAdsBwIntegrationExtension.A00;
            if (num3 != null) {
                j = num3.intValue();
            } else {
                j = 0;
            }
            sfz.A02 = iABAdsBwIntegrationExtension.A04;
            sfz.A00 = j;
            Integer num4 = C05F.A0N;
            sfz.A01 = num4;
            Object obj = qIz.A03;
            if (obj == num4) {
                c63933Sw8 = new C63932Sw7(intent);
            } else {
                Integer num5 = C05F.A01;
                if (num2 != num5 || obj != num5) {
                    return;
                } else {
                    c63933Sw8 = new C63933Sw8(intent);
                }
            }
            this.A00 = c63933Sw8;
        }
    }
}
