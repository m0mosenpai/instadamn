package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.textcell.IgdsFooterCell;
import java.util.List;

/* loaded from: classes8.dex */
public final class JQA extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public final int A08;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JQA(C202038wi c202038wi, Integer num, List list, List list2, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A08 = 3;
        this.A07 = c202038wi;
        this.A0B = num;
        this.A09 = list;
        this.A0A = list2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        InterfaceC38391qT interfaceC38391qT;
        EnumC77213d7 enumC77213d7;
        UserSession userSession;
        Context context;
        C142596cL c142596cL;
        int i;
        C07T c07t;
        C07S c07s;
        C19L c19l;
        InterfaceC16620sF interfaceC16620sF;
        int i2;
        switch (this.A08) {
            case 0:
                c07t = (C07T) this.A01;
                c07s = (C07S) this.A0B;
                c19l = (C19L) this.A09;
                interfaceC16620sF = (InterfaceC16620sF) this.A0A;
                i2 = 0;
                return new JQA(c07s, c07t, interfaceC23621Ds, interfaceC16620sF, c19l, i2);
            case 1:
                interfaceC38391qT = (InterfaceC38391qT) this.A0A;
                enumC77213d7 = (EnumC77213d7) this.A0B;
                userSession = (UserSession) this.A01;
                context = (Context) this.A09;
                c142596cL = (C142596cL) this.A07;
                i = 1;
                break;
            case 2:
                interfaceC38391qT = (InterfaceC38391qT) this.A0A;
                enumC77213d7 = (EnumC77213d7) this.A0B;
                userSession = (UserSession) this.A01;
                context = (Context) this.A09;
                c142596cL = (C142596cL) this.A07;
                i = 2;
                break;
            case 3:
                return new JQA((C202038wi) this.A07, (Integer) this.A0B, (List) this.A09, (List) this.A0A, interfaceC23621Ds);
            case 4:
                C07X c07x = (C07X) this.A05;
                C07S c07s2 = (C07S) this.A04;
                C26815Bsd c26815Bsd = (C26815Bsd) this.A07;
                View view = (View) this.A06;
                IgdsHeadline igdsHeadline = (IgdsHeadline) this.A03;
                return new JQA(view, c07s2, c07x, c26815Bsd, (IgdsBottomButtonLayout) this.A09, (IgdsBulletCell) this.A0A, (IgdsBulletCell) this.A01, (IgdsBulletCell) this.A0B, igdsHeadline, (IgdsFooterCell) this.A02, interfaceC23621Ds);
            default:
                c07t = (C07T) this.A01;
                c07s = (C07S) this.A0B;
                c19l = (C19L) this.A09;
                interfaceC16620sF = (InterfaceC16620sF) this.A0A;
                i2 = 5;
                return new JQA(c07s, c07t, interfaceC23621Ds, interfaceC16620sF, c19l, i2);
        }
        return new JQA(context, c142596cL, userSession, enumC77213d7, interfaceC38391qT, interfaceC23621Ds, i);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((JQA) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0229 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0318  */
    /* JADX WARN: Type inference failed for: r10v9, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v13, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0284 -> B:76:0x0250). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JQA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JQA(Context context, C142596cL c142596cL, UserSession userSession, EnumC77213d7 enumC77213d7, InterfaceC38391qT interfaceC38391qT, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A08 = i;
        this.A0A = interfaceC38391qT;
        this.A0B = enumC77213d7;
        this.A01 = userSession;
        this.A09 = context;
        this.A07 = c142596cL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JQA(C07S c07s, C07T c07t, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF, C19L c19l, int i) {
        super(2, interfaceC23621Ds);
        this.A08 = i;
        this.A01 = c07t;
        this.A0B = c07s;
        this.A09 = c19l;
        this.A0A = interfaceC16620sF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JQA(View view, C07S c07s, C07X c07x, C26815Bsd c26815Bsd, IgdsBottomButtonLayout igdsBottomButtonLayout, IgdsBulletCell igdsBulletCell, IgdsBulletCell igdsBulletCell2, IgdsBulletCell igdsBulletCell3, IgdsHeadline igdsHeadline, IgdsFooterCell igdsFooterCell, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A08 = 4;
        this.A05 = c07x;
        this.A04 = c07s;
        this.A07 = c26815Bsd;
        this.A06 = view;
        this.A03 = igdsHeadline;
        this.A0A = igdsBulletCell;
        this.A01 = igdsBulletCell2;
        this.A0B = igdsBulletCell3;
        this.A02 = igdsFooterCell;
        this.A09 = igdsBottomButtonLayout;
    }
}
