package X;

import java.util.Map;

/* renamed from: X.EOr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32390EOr extends AbstractC193068gm {
    public final /* synthetic */ C62862tP A00;
    public final /* synthetic */ AbstractC12990ll A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;

    @Override // X.AbstractC192848gQ
    public final void A03(AbstractC115105If abstractC115105If) {
        C14360o3.A0B(abstractC115105If, 0);
        Throwable A01 = abstractC115105If.A01();
        String str = this.A03;
        if (A01 != null) {
            C0w9.A06(str, "Failed to load consent flow", A01);
        } else {
            C0w9.A03(str, "Failed to load consent flow");
        }
    }

    public C32390EOr(C62862tP c62862tP, AbstractC12990ll abstractC12990ll, String str, String str2, Map map) {
        this.A02 = str;
        this.A04 = map;
        this.A00 = c62862tP;
        this.A01 = abstractC12990ll;
        this.A03 = str2;
    }

    @Override // X.AbstractC192848gQ
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C66246U5q A0E = AbstractC31175DnJ.A0E(obj);
        if (A0E.A02 == null) {
            AbstractC31174DnI.A19(this.A00.A03, C66277U6x.A01(this.A02, this.A04), this.A01);
        } else {
            AbstractC33787EwD.A00(this.A00, A0E);
        }
    }
}
