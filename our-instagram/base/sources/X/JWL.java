package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes8.dex */
public final class JWL extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JWL(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A06 = i;
        this.A09 = obj;
        this.A07 = obj2;
        this.A08 = obj3;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        JWL jwl;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        int i;
        switch (this.A06) {
            case 0:
                jwl = new JWL(this.A09, this.A07, this.A03, this.A02, this.A01, this.A04, this.A08, interfaceC23621Ds, 0);
                break;
            case 1:
                obj2 = this.A09;
                obj6 = this.A08;
                obj8 = this.A07;
                obj5 = this.A03;
                obj7 = this.A01;
                obj4 = this.A05;
                obj9 = this.A02;
                obj3 = this.A04;
                i = 1;
                return new JWL(obj3, obj5, obj2, obj8, obj4, obj9, obj7, obj6, interfaceC23621Ds, i);
            case 2:
                obj6 = this.A08;
                obj4 = this.A05;
                obj8 = this.A07;
                obj7 = this.A01;
                obj5 = this.A03;
                obj2 = this.A09;
                obj3 = this.A04;
                obj9 = this.A02;
                i = 2;
                return new JWL(obj3, obj5, obj2, obj8, obj4, obj9, obj7, obj6, interfaceC23621Ds, i);
            case 3:
                C167297di c167297di = (C167297di) this.A01;
                MediaCommentListRepository mediaCommentListRepository = (MediaCommentListRepository) this.A09;
                InterfaceC38371qR interfaceC38371qR = (InterfaceC38371qR) this.A02;
                JWL jwl2 = new JWL((MOF) this.A07, (InterfaceC30934Dio) this.A08, mediaCommentListRepository, c167297di, interfaceC38371qR, interfaceC23621Ds);
                jwl2.A03 = obj;
                return jwl2;
            case 4:
                obj3 = this.A04;
                obj5 = this.A03;
                obj2 = this.A09;
                obj8 = this.A07;
                obj4 = this.A05;
                obj9 = this.A02;
                obj7 = this.A01;
                obj6 = this.A08;
                i = 4;
                return new JWL(obj3, obj5, obj2, obj8, obj4, obj9, obj7, obj6, interfaceC23621Ds, i);
            case 5:
                Object obj10 = this.A09;
                Object obj11 = this.A04;
                Object obj12 = this.A02;
                Object obj13 = this.A03;
                jwl = new JWL(obj10, this.A07, obj13, obj12, this.A01, obj11, this.A08, interfaceC23621Ds, 5);
                break;
            case 6:
                obj2 = this.A09;
                obj6 = this.A08;
                obj5 = this.A03;
                obj7 = this.A01;
                obj3 = this.A04;
                obj8 = this.A07;
                obj4 = this.A05;
                obj9 = this.A02;
                i = 6;
                return new JWL(obj3, obj5, obj2, obj8, obj4, obj9, obj7, obj6, interfaceC23621Ds, i);
            case 7:
                obj3 = this.A04;
                obj9 = this.A02;
                obj2 = this.A09;
                obj6 = this.A08;
                obj7 = this.A01;
                obj5 = this.A03;
                obj8 = this.A07;
                obj4 = this.A05;
                i = 7;
                return new JWL(obj3, obj5, obj2, obj8, obj4, obj9, obj7, obj6, interfaceC23621Ds, i);
            case 8:
                obj4 = this.A05;
                obj3 = this.A04;
                obj2 = this.A09;
                obj5 = this.A03;
                obj9 = this.A02;
                obj8 = this.A07;
                obj7 = this.A01;
                obj6 = this.A08;
                i = 8;
                return new JWL(obj3, obj5, obj2, obj8, obj4, obj9, obj7, obj6, interfaceC23621Ds, i);
            case 9:
                Object obj14 = this.A09;
                Object obj15 = this.A04;
                jwl = new JWL(obj14, this.A07, this.A03, this.A02, this.A01, obj15, this.A08, interfaceC23621Ds, 9);
                break;
            case 10:
                obj3 = this.A04;
                obj5 = this.A03;
                obj2 = this.A09;
                obj4 = this.A05;
                obj6 = this.A08;
                obj8 = this.A07;
                obj7 = this.A01;
                obj9 = this.A02;
                i = 10;
                return new JWL(obj3, obj5, obj2, obj8, obj4, obj9, obj7, obj6, interfaceC23621Ds, i);
            case 11:
                return new JWL(this.A09, this.A07, this.A08, interfaceC23621Ds, 11);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj2 = this.A09;
                obj3 = this.A04;
                obj4 = this.A05;
                obj5 = this.A03;
                obj6 = this.A08;
                obj7 = this.A01;
                obj8 = this.A07;
                obj9 = this.A02;
                i = 12;
                return new JWL(obj3, obj5, obj2, obj8, obj4, obj9, obj7, obj6, interfaceC23621Ds, i);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                Object obj16 = this.A08;
                return new JWL(this.A09, this.A07, obj16, interfaceC23621Ds, 13);
            default:
                obj5 = this.A03;
                obj8 = this.A07;
                obj2 = this.A09;
                obj3 = this.A04;
                obj7 = this.A01;
                obj9 = this.A02;
                obj6 = this.A08;
                obj4 = this.A05;
                i = 14;
                return new JWL(obj3, obj5, obj2, obj8, obj4, obj9, obj7, obj6, interfaceC23621Ds, i);
        }
        jwl.A05 = obj;
        return jwl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:223:0x0068, code lost:
    
        if (r1 != r7) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0b40, code lost:
    
        if (r2.contains(r47.A08) != true) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0cc9, code lost:
    
        if (X.C18U.A06(X.AbstractC25225BEi.A0j(r2, 0), r2, 36327172694423938L) == false) goto L294;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:354:0x0c9a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0f48 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x09a1 A[LOOP:14: B:204:0x099b->B:206:0x09a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x09f7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0a3d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0a41 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0bb8  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0bbd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0cce  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0ce9  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0cfb  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0d3c  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0d43  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0d5c  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0d5e  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x1181 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0f69  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0f71  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0f87  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0f8b  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x106f  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x101e  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x104b  */
    /* JADX WARN: Type inference failed for: r16v0, types: [X.0pT, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.19L, int] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r48) {
        /*
            Method dump skipped, instructions count: 4648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JWL.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((JWL) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JWL(MOF mof, InterfaceC30934Dio interfaceC30934Dio, MediaCommentListRepository mediaCommentListRepository, C167297di c167297di, InterfaceC38371qR interfaceC38371qR, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A06 = 3;
        this.A01 = c167297di;
        this.A09 = mediaCommentListRepository;
        this.A02 = interfaceC38371qR;
        this.A08 = interfaceC30934Dio;
        this.A07 = mof;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JWL(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A06 = i;
        this.A04 = obj;
        this.A03 = obj2;
        this.A09 = obj3;
        this.A07 = obj4;
        this.A05 = obj5;
        this.A02 = obj6;
        this.A01 = obj7;
        this.A08 = obj8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JWL(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A06 = i;
        this.A09 = obj;
        this.A07 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
        this.A01 = obj5;
        this.A04 = obj6;
        this.A08 = obj7;
    }
}
