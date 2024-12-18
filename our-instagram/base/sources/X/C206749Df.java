package X;

import com.instagram.comments.mvvm.data.MediaCommentListRepository;

/* renamed from: X.9Df, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206749Df extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206749Df(Object obj, Object obj2, Object obj3, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A04 = obj;
        this.A03 = obj2;
        this.A05 = str;
        this.A06 = str2;
        this.A01 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        String str;
        Object obj2;
        String str2;
        Object obj3;
        int i;
        int i2 = this.A02;
        Object obj4 = this.A04;
        switch (i2) {
            case 0:
                obj3 = this.A03;
                str = this.A05;
                str2 = this.A06;
                obj2 = this.A01;
                i = 0;
                return new C206749Df(obj4, obj3, obj2, str, str2, interfaceC23621Ds, i);
            case 1:
                return new C206749Df((MediaCommentListRepository) obj4, (EnumC166167bk) this.A03, this.A06, this.A05, interfaceC23621Ds);
            case 2:
                str = this.A05;
                obj2 = this.A01;
                str2 = this.A06;
                obj3 = this.A03;
                i = 2;
                return new C206749Df(obj4, obj3, obj2, str, str2, interfaceC23621Ds, i);
            default:
                str2 = this.A06;
                str = this.A05;
                obj2 = this.A01;
                obj3 = this.A03;
                i = 3;
                return new C206749Df(obj4, obj3, obj2, str, str2, interfaceC23621Ds, i);
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C206749Df) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01df, code lost:
    
        if (r0.ordinal() != 357) goto L102;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x0060. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0194 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f0  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206749Df.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206749Df(MediaCommentListRepository mediaCommentListRepository, EnumC166167bk enumC166167bk, String str, String str2, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A02 = 1;
        this.A04 = mediaCommentListRepository;
        this.A06 = str;
        this.A05 = str2;
        this.A03 = enumC166167bk;
    }
}
