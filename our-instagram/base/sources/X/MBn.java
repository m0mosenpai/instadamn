package X;

import com.instagram.barcelona.feed.post.data.PostViewStateRepository;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public final class MBn extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02 = 0;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBn(PostViewStateRepository postViewStateRepository, InterfaceC11380iw interfaceC11380iw, C84923qg c84923qg, C84923qg c84923qg2, C84923qg c84923qg3, C38321qM c38321qM, String str, String str2, String str3, List list, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A08 = postViewStateRepository;
        this.A0B = str;
        this.A05 = c38321qM;
        this.A09 = str2;
        this.A03 = interfaceC11380iw;
        this.A04 = list;
        this.A0A = str3;
        this.A07 = c84923qg;
        this.A01 = c84923qg2;
        this.A06 = c84923qg3;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A02 != 0) {
            PostViewStateRepository postViewStateRepository = (PostViewStateRepository) this.A08;
            String str = this.A0B;
            C38321qM c38321qM = (C38321qM) this.A05;
            String str2 = this.A09;
            InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A03;
            List list = (List) this.A04;
            return new MBn(postViewStateRepository, interfaceC11380iw, (C84923qg) this.A07, (C84923qg) this.A01, (C84923qg) this.A06, c38321qM, str, str2, this.A0A, list, interfaceC23621Ds);
        }
        UserSession userSession = (UserSession) this.A07;
        C8B8 c8b8 = (C8B8) this.A05;
        String str3 = this.A0B;
        return new MBn((EnumC223429tZ) this.A04, (C22P) this.A06, (C142246bh) this.A08, userSession, c8b8, (InterfaceC38391qT) this.A03, str3, this.A09, this.A0A, interfaceC23621Ds);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0257 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0269 A[Catch: Exception -> 0x027b, TryCatch #0 {Exception -> 0x027b, blocks: (B:73:0x01c7, B:74:0x01ca, B:76:0x01f0, B:77:0x01ff, B:80:0x0231, B:81:0x023b, B:84:0x025b, B:87:0x0262, B:89:0x0269, B:90:0x026c, B:95:0x0270, B:96:0x0222, B:98:0x0226, B:99:0x0251, B:100:0x0211, B:101:0x0258, B:103:0x019c, B:105:0x01ac, B:107:0x01b4, B:108:0x01b6, B:110:0x01c2, B:113:0x01bd), top: B:69:0x0163 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0270 A[Catch: Exception -> 0x027b, TRY_LEAVE, TryCatch #0 {Exception -> 0x027b, blocks: (B:73:0x01c7, B:74:0x01ca, B:76:0x01f0, B:77:0x01ff, B:80:0x0231, B:81:0x023b, B:84:0x025b, B:87:0x0262, B:89:0x0269, B:90:0x026c, B:95:0x0270, B:96:0x0222, B:98:0x0226, B:99:0x0251, B:100:0x0211, B:101:0x0258, B:103:0x019c, B:105:0x01ac, B:107:0x01b4, B:108:0x01b6, B:110:0x01c2, B:113:0x01bd), top: B:69:0x0163 }] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MBn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MBn) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBn(EnumC223429tZ enumC223429tZ, C22P c22p, C142246bh c142246bh, UserSession userSession, C8B8 c8b8, InterfaceC38391qT interfaceC38391qT, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A07 = userSession;
        this.A05 = c8b8;
        this.A0B = str;
        this.A08 = c142246bh;
        this.A09 = str2;
        this.A0A = str3;
        this.A04 = enumC223429tZ;
        this.A06 = c22p;
        this.A03 = interfaceC38391qT;
    }
}
