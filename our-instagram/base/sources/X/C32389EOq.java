package X;

import android.content.Context;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.util.Collections;

/* renamed from: X.EOq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32389EOq extends AbstractC193068gm {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C32389EOq(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A04 = str;
        this.A01 = obj;
    }

    @Override // X.AbstractC192848gQ
    public final void A03(AbstractC115105If abstractC115105If) {
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A02;
                if (interfaceC103384lE != null) {
                    AbstractC31171DnF.A1K((C6FQ) this.A01, interfaceC103384lE);
                }
                str = this.A04;
                str2 = "AsyncAction";
                break;
            case 1:
                AbstractC31171DnF.A1K((C6FQ) this.A01, (InterfaceC103384lE) this.A02);
                str = this.A04;
                str2 = "AsyncActionWithDataManifest";
                break;
            default:
                C14360o3.A0B(abstractC115105If, 0);
                Throwable A01 = abstractC115105If.A01();
                String A00 = AbstractC111324zv.A00(57);
                String A002 = AbstractC111324zv.A00(3714);
                if (A01 != null) {
                    C0w9.A06(A002, A00, A01);
                } else {
                    C0w9.A03(A002, A00);
                }
                String str3 = this.A04;
                if (str3 != null) {
                    C9GR.A03((Context) this.A01, str3, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, 0);
                }
                AbstractC31171DnF.A1N(this.A02);
                return;
        }
        F0B.A00(abstractC115105If, str2, str);
    }

    @Override // X.AbstractC192848gQ
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        if (2 - this.A00 != 0) {
            C6FP.A06((C66246U5q) obj, (C6FQ) this.A01, (InterfaceC103384lE) this.A03, (InterfaceC103384lE) this.A02, Collections.emptyMap());
        } else {
            AbstractC33787EwD.A00((C62862tP) this.A03, AbstractC31175DnJ.A0E(obj));
            AbstractC31171DnF.A1N(this.A02);
        }
    }
}
