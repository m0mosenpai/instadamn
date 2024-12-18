package X;

import androidx.compose.runtime.Recomposer;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.9DS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DS extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DS(ClipsCreationDraftViewModel clipsCreationDraftViewModel, C128175qm c128175qm, C115475Kh c115475Kh, C115525Km c115525Km, C49602Pt c49602Pt, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A06 = 3;
        this.A03 = c115525Km;
        this.A04 = c115475Kh;
        this.A05 = clipsCreationDraftViewModel;
        this.A01 = c49602Pt;
        this.A02 = c128175qm;
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        int i2;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        int i3;
        switch (this.A06) {
            case 0:
                C9DS c9ds = new C9DS((AnonymousClass577) this.A02, (Recomposer) this.A05, interfaceC23621Ds, (InterfaceC16610sE) this.A01);
                c9ds.A03 = obj;
                return c9ds;
            case 1:
                C9DS c9ds2 = new C9DS((C07S) this.A03, (C07T) this.A02, interfaceC23621Ds, (C12W) this.A01, (InterfaceC19390xP) this.A04);
                c9ds2.A05 = obj;
                return c9ds2;
            case 2:
                obj7 = this.A05;
                obj6 = this.A04;
                obj8 = this.A03;
                obj5 = this.A02;
                obj9 = this.A01;
                i3 = 2;
                return new C9DS(obj5, obj6, obj7, obj8, obj9, interfaceC23621Ds, i3);
            case 3:
                C115525Km c115525Km = (C115525Km) this.A03;
                C115475Kh c115475Kh = (C115475Kh) this.A04;
                return new C9DS((ClipsCreationDraftViewModel) this.A05, (C128175qm) this.A02, c115475Kh, c115525Km, (C49602Pt) this.A01, interfaceC23621Ds, this.A00);
            case 4:
                obj2 = this.A05;
                obj3 = this.A01;
                i = 4;
                return new C9DS(obj2, obj3, interfaceC23621Ds, i);
            case 5:
                obj4 = this.A05;
                i2 = 5;
                return new C9DS(obj4, interfaceC23621Ds, i2);
            case 6:
                obj2 = this.A05;
                obj3 = this.A01;
                i = 6;
                return new C9DS(obj2, obj3, interfaceC23621Ds, i);
            case 7:
                List list = (List) this.A02;
                return new C9DS((UserSession) this.A03, (ContentFilterDictionarySyncManager) this.A05, list, (List) this.A01, interfaceC23621Ds);
            case 8:
                obj2 = this.A05;
                obj3 = this.A01;
                i = 8;
                return new C9DS(obj2, obj3, interfaceC23621Ds, i);
            case 9:
                obj4 = this.A05;
                i2 = 9;
                return new C9DS(obj4, interfaceC23621Ds, i2);
            case 10:
                obj2 = this.A05;
                obj3 = this.A01;
                i = 10;
                return new C9DS(obj2, obj3, interfaceC23621Ds, i);
            case 11:
                C9DS c9ds3 = new C9DS(this.A05, interfaceC23621Ds, 11);
                c9ds3.A01 = obj;
                return c9ds3;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj5 = this.A02;
                obj6 = this.A04;
                obj7 = this.A05;
                obj8 = this.A03;
                obj9 = this.A01;
                i3 = 12;
                return new C9DS(obj5, obj6, obj7, obj8, obj9, interfaceC23621Ds, i3);
            default:
                obj8 = this.A03;
                obj7 = this.A05;
                obj6 = this.A04;
                obj9 = this.A01;
                obj5 = this.A02;
                i3 = 13;
                return new C9DS(obj5, obj6, obj7, obj8, obj9, interfaceC23621Ds, i3);
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9DS) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x07af: INVOKE (r5 I:X.139), (r7 I:java.lang.Object) VIRTUAL call: X.139.A04(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:1967), block:B:380:0x07af */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x07af: INVOKE (r5v0 ?? I:X.139), (r7 I:java.lang.Object) VIRTUAL call: X.139.A04(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:1967), block:B:380:0x07af */
    /* JADX WARN: Removed duplicated region for block: B:140:0x07de A[Catch: all -> 0x07ee, TRY_ENTER, TryCatch #6 {, blocks: (B:130:0x0453, B:132:0x0457, B:133:0x0459, B:140:0x07de, B:142:0x07e2, B:143:0x07e4), top: B:122:0x0345 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x033e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0204 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e7 A[RETURN] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v40, types: [X.195, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v43, types: [java.lang.Object] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 2084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9DS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DS(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A06 = i;
        this.A05 = obj;
        this.A01 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DS(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A06 = i;
        this.A02 = obj;
        this.A04 = obj2;
        this.A05 = obj3;
        this.A03 = obj4;
        this.A01 = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DS(AnonymousClass577 anonymousClass577, Recomposer recomposer, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16610sE interfaceC16610sE) {
        super(2, interfaceC23621Ds);
        this.A06 = 0;
        this.A05 = recomposer;
        this.A01 = interfaceC16610sE;
        this.A02 = anonymousClass577;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DS(C07S c07s, C07T c07t, InterfaceC23621Ds interfaceC23621Ds, C12W c12w, InterfaceC19390xP interfaceC19390xP) {
        super(2, interfaceC23621Ds);
        this.A06 = 1;
        this.A02 = c07t;
        this.A03 = c07s;
        this.A01 = c12w;
        this.A04 = interfaceC19390xP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DS(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A06 = i;
        this.A05 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DS(UserSession userSession, ContentFilterDictionarySyncManager contentFilterDictionarySyncManager, List list, List list2, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A06 = 7;
        this.A02 = list;
        this.A05 = contentFilterDictionarySyncManager;
        this.A03 = userSession;
        this.A01 = list2;
    }
}
