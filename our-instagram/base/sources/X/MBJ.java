package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class MBJ extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBJ(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, String str, String str2, String str3, String str4, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A05 = obj;
        this.A07 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A0C = str;
        this.A0E = str2;
        this.A0D = str3;
        this.A09 = obj5;
        this.A0B = str4;
        this.A0F = z;
        this.A08 = obj6;
        this.A06 = obj7;
        this.A0A = obj8;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        String str;
        String str2;
        String str3;
        Object obj6;
        String str4;
        boolean z;
        Object obj7;
        Object obj8;
        Object obj9;
        int i;
        if (this.A02 != 0) {
            obj4 = this.A05;
            obj2 = this.A07;
            obj3 = this.A03;
            obj5 = this.A04;
            str = this.A0C;
            str2 = this.A0E;
            str3 = this.A0D;
            obj6 = this.A09;
            str4 = this.A0B;
            z = this.A0F;
            obj7 = this.A08;
            obj8 = this.A06;
            obj9 = this.A0A;
            i = 1;
        } else {
            obj2 = this.A07;
            obj3 = this.A03;
            obj4 = this.A05;
            obj5 = this.A04;
            str = this.A0C;
            str2 = this.A0E;
            str3 = this.A0D;
            obj6 = this.A09;
            str4 = this.A0B;
            z = this.A0F;
            obj7 = this.A08;
            obj8 = this.A06;
            obj9 = this.A0A;
            i = 0;
        }
        MBJ mbj = new MBJ(obj4, obj2, obj3, obj5, obj6, obj7, obj8, obj9, str, str2, str3, str4, interfaceC23621Ds, i, z);
        mbj.A01 = obj;
        return mbj;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A02;
        C1JX c1jx = C1JX.A02;
        int i2 = this.A00;
        if (i != 0) {
            if (i2 != 0) {
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                Object obj2 = this.A01;
                C0UO c0uo = ((KZA) this.A05).A04;
                Object obj3 = this.A07;
                Object obj4 = this.A03;
                Object obj5 = this.A04;
                String str = this.A0C;
                String str2 = this.A0E;
                String str3 = this.A0D;
                MBJ mbj = new MBJ(obj2, obj3, obj4, obj5, this.A09, this.A08, this.A06, this.A0A, str, str2, str3, this.A0B, null, 0, this.A0F);
                this.A00 = 1;
                if (AbstractC18560vj.A00(this, mbj, c0uo) == c1jx) {
                    return c1jx;
                }
            }
        } else {
            if (i2 != 0) {
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                InterfaceC57806PkY interfaceC57806PkY = (InterfaceC57806PkY) this.A01;
                if (interfaceC57806PkY != null && !interfaceC57806PkY.equals(MUq.A00)) {
                    if (!MU9.A00(interfaceC57806PkY)) {
                        if (MU9.A01(interfaceC57806PkY, 1)) {
                            C47777L8c c47777L8c = (C47777L8c) this.A07;
                            if (c47777L8c != null) {
                                c47777L8c.A00();
                            }
                            C51701MsW c51701MsW = (C51701MsW) ((MU9) interfaceC57806PkY).A01;
                            if (c51701MsW.A03 == C05F.A0C) {
                                C49072Lmy c49072Lmy = (C49072Lmy) this.A04;
                                long j = C49072Lmy.A04;
                                C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A0C, c49072Lmy.A01);
                                String str4 = this.A0C;
                                c116875Qr.A1D = str4;
                                String str5 = c51701MsW.A04;
                                c116875Qr.A0h = str5;
                                String str6 = this.A0E;
                                c116875Qr.A1F = str6;
                                AtomicBoolean atomicBoolean = C38321qM.A0i;
                                c116875Qr.A1J = C38801rC.A06(str4);
                                c116875Qr.A0i = this.A0D;
                                c116875Qr.A0o = c49072Lmy.A00.requireContext().getString(2131953861);
                                C49072Lmy.A00(c116875Qr, c49072Lmy, c47777L8c, (C7U0) this.A08, (DirectThreadKey) this.A06, (MessageIdentifier) this.A09, (MsysThreadId) this.A0A, str4, this.A0B, str6, str5, this.A0F, true);
                                AnonymousClass194.A05(null, (C19L) this.A05);
                            }
                            AbstractC166987dD.A1Y(this.A03);
                            AnonymousClass194.A05(null, (C19L) this.A05);
                        } else {
                            throw B4Z.A00();
                        }
                    }
                } else {
                    long j2 = C49072Lmy.A04;
                    this.A00 = 1;
                    if (AbstractC89993zf.A02(this, j2) == c1jx) {
                        return c1jx;
                    }
                }
            }
            C47777L8c c47777L8c2 = (C47777L8c) this.A07;
            if (c47777L8c2 != null) {
                c47777L8c2.A00();
            }
            AbstractC166987dD.A1Y(this.A03);
            AnonymousClass194.A05(null, (C19L) this.A05);
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MBJ) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
