package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;
import java.util.Collections;

/* renamed from: X.Lny, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49121Lny implements C7QC {
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC164887Zb A03;
    public final AnonymousClass988 A04;
    public final C1579277b A05;
    public final C7DK A07;
    public final boolean A08;
    public final C7DL A06 = new C7DL();
    public C158677Ad A00 = null;

    public C49121Lny(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC164887Zb interfaceC164887Zb, AnonymousClass988 anonymousClass988, C7DK c7dk, boolean z) {
        this.A03 = interfaceC164887Zb;
        this.A01 = interfaceC11380iw;
        this.A07 = c7dk;
        this.A02 = userSession;
        this.A08 = z;
        this.A05 = new C1579277b(interfaceC11380iw, userSession, (C7ZZ) interfaceC164887Zb, anonymousClass988, c7dk, Collections.emptyList(), false, z);
        this.A04 = anonymousClass988;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r0.A02(r5) == false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01eb A[Catch: all -> 0x02df, TryCatch #4 {all -> 0x02df, blocks: (B:5:0x0018, B:7:0x001c, B:9:0x0028, B:11:0x005f, B:12:0x0084, B:14:0x0099, B:15:0x00b2, B:17:0x00b8, B:19:0x00c4, B:21:0x00d1, B:22:0x00d3, B:24:0x00e0, B:25:0x00c9, B:27:0x00cd, B:31:0x00e5, B:33:0x00eb, B:34:0x00fa, B:36:0x010d, B:41:0x013a, B:42:0x013f, B:43:0x014c, B:44:0x0154, B:47:0x015a, B:50:0x016b, B:52:0x016f, B:58:0x01d4, B:61:0x01da, B:63:0x01eb, B:64:0x01f4, B:65:0x01f6, B:67:0x0207, B:69:0x020b, B:73:0x0213, B:102:0x02c7, B:141:0x02de, B:140:0x02db, B:121:0x017e, B:134:0x01ce, B:143:0x0123, B:144:0x0129, B:145:0x0024, B:105:0x02d1, B:137:0x02d6, B:75:0x021e, B:76:0x0224, B:78:0x022a, B:92:0x0236, B:94:0x023e, B:95:0x0254, B:96:0x0258, B:98:0x0262, B:99:0x0278, B:81:0x0291, B:85:0x0297, B:86:0x029d, B:123:0x0188, B:124:0x0193, B:126:0x0199, B:129:0x01a3), top: B:4:0x0018, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0207 A[Catch: all -> 0x02df, TryCatch #4 {all -> 0x02df, blocks: (B:5:0x0018, B:7:0x001c, B:9:0x0028, B:11:0x005f, B:12:0x0084, B:14:0x0099, B:15:0x00b2, B:17:0x00b8, B:19:0x00c4, B:21:0x00d1, B:22:0x00d3, B:24:0x00e0, B:25:0x00c9, B:27:0x00cd, B:31:0x00e5, B:33:0x00eb, B:34:0x00fa, B:36:0x010d, B:41:0x013a, B:42:0x013f, B:43:0x014c, B:44:0x0154, B:47:0x015a, B:50:0x016b, B:52:0x016f, B:58:0x01d4, B:61:0x01da, B:63:0x01eb, B:64:0x01f4, B:65:0x01f6, B:67:0x0207, B:69:0x020b, B:73:0x0213, B:102:0x02c7, B:141:0x02de, B:140:0x02db, B:121:0x017e, B:134:0x01ce, B:143:0x0123, B:144:0x0129, B:145:0x0024, B:105:0x02d1, B:137:0x02d6, B:75:0x021e, B:76:0x0224, B:78:0x022a, B:92:0x0236, B:94:0x023e, B:95:0x0254, B:96:0x0258, B:98:0x0262, B:99:0x0278, B:81:0x0291, B:85:0x0297, B:86:0x029d, B:123:0x0188, B:124:0x0193, B:126:0x0199, B:129:0x01a3), top: B:4:0x0018, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0213 A[Catch: all -> 0x02df, TRY_LEAVE, TryCatch #4 {all -> 0x02df, blocks: (B:5:0x0018, B:7:0x001c, B:9:0x0028, B:11:0x005f, B:12:0x0084, B:14:0x0099, B:15:0x00b2, B:17:0x00b8, B:19:0x00c4, B:21:0x00d1, B:22:0x00d3, B:24:0x00e0, B:25:0x00c9, B:27:0x00cd, B:31:0x00e5, B:33:0x00eb, B:34:0x00fa, B:36:0x010d, B:41:0x013a, B:42:0x013f, B:43:0x014c, B:44:0x0154, B:47:0x015a, B:50:0x016b, B:52:0x016f, B:58:0x01d4, B:61:0x01da, B:63:0x01eb, B:64:0x01f4, B:65:0x01f6, B:67:0x0207, B:69:0x020b, B:73:0x0213, B:102:0x02c7, B:141:0x02de, B:140:0x02db, B:121:0x017e, B:134:0x01ce, B:143:0x0123, B:144:0x0129, B:145:0x0024, B:105:0x02d1, B:137:0x02d6, B:75:0x021e, B:76:0x0224, B:78:0x022a, B:92:0x0236, B:94:0x023e, B:95:0x0254, B:96:0x0258, B:98:0x0262, B:99:0x0278, B:81:0x0291, B:85:0x0297, B:86:0x029d, B:123:0x0188, B:124:0x0193, B:126:0x0199, B:129:0x01a3), top: B:4:0x0018, inners: #3 }] */
    /* JADX WARN: Type inference failed for: r11v5, types: [X.77b] */
    /* JADX WARN: Type inference failed for: r13v6, types: [X.7aM, X.7Zb] */
    /* JADX WARN: Type inference failed for: r14v2, types: [X.7aM, X.7Zb] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, X.5tK] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v20, types: [X.5tK] */
    /* JADX WARN: Type inference failed for: r1v22, types: [int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v25, types: [int] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // X.C7QC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ADy(X.C7QD r29, X.InterfaceC129555tK r30) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49121Lny.ADy(X.7QD, X.5tK):void");
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        Parcelable A1M;
        C49171Loo c49171Loo = (C49171Loo) c7qd;
        AbstractC70663Fe abstractC70663Fe = c49171Loo.A05.A0D;
        if (c49171Loo.A01 != null && abstractC70663Fe != null && (A1M = abstractC70663Fe.A1M()) != null) {
            this.A06.A02(c49171Loo.A01, A1M);
        }
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.direct_hscroll_container);
        Context context = viewGroup.getContext();
        JoG joG = new JoG(AbstractC53242c7.A0G(context, R.attr.avatarStartSpacing), AbstractC166987dD.A0C(context, 4));
        C49171Loo c49171Loo = new C49171Loo(layoutInflater, A0A, viewGroup, joG);
        HorizontalRecyclerPager horizontalRecyclerPager = c49171Loo.A05;
        C7DK c7dk = this.A07;
        InterfaceC164887Zb interfaceC164887Zb = this.A03;
        horizontalRecyclerPager.setAdapter(new Jo0(layoutInflater, this.A01, this.A02, interfaceC164887Zb, this.A04, c7dk, this.A08));
        AbstractC13880nE.A0g(horizontalRecyclerPager, AbstractC13880nE.A0A(context));
        AbstractC70663Fe abstractC70663Fe = horizontalRecyclerPager.A0D;
        if (abstractC70663Fe != null) {
            abstractC70663Fe.A12(true);
            horizontalRecyclerPager.setLayoutManager(abstractC70663Fe);
        }
        horizontalRecyclerPager.A10(joG);
        A0A.setTag(c49171Loo);
        return c49171Loo;
    }
}
