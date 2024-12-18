package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.fragment.app.Fragment;
import com.instagram.archive.fragment.InlineAddHighlightFragment;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.FtO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35904FtO implements InterfaceC58138Pq3 {
    public final Context A00;
    public final C25671My A01;
    public final UserSession A02;
    public final C38321qM A03;
    public final ImageUrl A04;
    public final C3G2 A05;
    public final String A06;

    @Override // X.InterfaceC58138Pq3
    public final void D8F(InlineAddHighlightFragment inlineAddHighlightFragment, C1GL c1gl, String str) {
        ImageUrl imageUrl = this.A04;
        RectF A07 = MX2.A07(MX2.A01(new Rect(0, 0, imageUrl.getWidth(), imageUrl.getHeight())), imageUrl.getWidth(), imageUrl.getHeight());
        UserSession userSession = this.A02;
        EnumC53243Ngg A01 = AbstractC50558MTp.A01(this.A05);
        String str2 = this.A06;
        HashSet A0k = AbstractC31171DnF.A0k(Collections.singletonList(str2));
        int height = imageUrl.getHeight();
        int width = imageUrl.getWidth();
        List asList = Arrays.asList(Float.valueOf(A07.left), Float.valueOf(A07.top), Float.valueOf(A07.right), Float.valueOf(A07.bottom));
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 3);
        C1ON A00 = AbstractC1571873x.A00(A01, userSession, str, str2, null, null, asList, A0k, height, width, false);
        A00.A00 = new ET9(this, inlineAddHighlightFragment);
        c1gl.schedule(A00);
    }

    @Override // X.InterfaceC58138Pq3
    public final void DPo(C155306yJ c155306yJ, List list) {
        GXB c35901FtL;
        C38321qM c38321qM = this.A03;
        if (c38321qM != null) {
            c35901FtL = new C35900FtK(c38321qM);
        } else {
            c35901FtL = new C35901FtL(this.A06);
        }
        C155306yJ.A01(c35901FtL, c155306yJ, list, GVK.A00);
    }

    public C35904FtO(Context context, UserSession userSession, ImageUrl imageUrl, C38321qM c38321qM, C3G2 c3g2, String str) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = AbstractC25651Mw.A00(userSession);
        this.A03 = c38321qM;
        this.A06 = str;
        this.A04 = imageUrl;
        this.A05 = c3g2;
    }

    public final void A00(ImageUrl imageUrl, String str) {
        C2OG A01 = C2OG.A01();
        C34648FOf A00 = C35129FeW.A00(this.A02.userId);
        A00.A0G = AbstractC111324zv.A00(216);
        A00.A04 = imageUrl;
        A00.A0H = str;
        A00.A03 = PushChannelType.A09;
        A00.A08 = new G8M(this, 0);
        C35129FeW.A01(A00, A01);
    }

    @Override // X.InterfaceC58138Pq3
    public final void Ddp(Fragment fragment, C1GL c1gl, String str, boolean z) {
        List A04;
        int height;
        int width;
        HashSet A1H = AbstractC166987dD.A1H();
        HashSet A1H2 = AbstractC166987dD.A1H();
        String str2 = this.A06;
        if (z) {
            A1H2.add(str2);
        } else {
            A1H.add(str2);
        }
        UserSession userSession = this.A02;
        Reel A0M = C1OU.A04(userSession).A0M(str);
        String str3 = null;
        if (A0M == null) {
            C0w9.A03("HighlightFromActiveStoryDelegate", "No currentReel found for onReelItemClick");
        } else {
            Context requireContext = fragment.requireContext();
            C14360o3.A0B(userSession, 0);
            C54662OCo A00 = AbstractC50558MTp.A00(requireContext, userSession, A0M, AbstractC166987dD.A1J(str2));
            if (A00 != null) {
                str3 = A00.A03;
                A04 = AbstractC50558MTp.A04(A00);
                ImageUrl imageUrl = A00.A02;
                height = imageUrl.getHeight();
                width = imageUrl.getWidth();
                EnumC53243Ngg A01 = AbstractC50558MTp.A01(this.A05);
                AbstractC167017dG.A1N(userSession, str);
                C1ON A012 = AbstractC1571873x.A01(A01, userSession, str, null, str3, null, A04, A1H, A1H2, height, width);
                A012.A00 = new C32523ETz(fragment, this, A0M, !z);
                c1gl.schedule(A012);
            }
        }
        A04 = null;
        height = 0;
        width = 0;
        EnumC53243Ngg A013 = AbstractC50558MTp.A01(this.A05);
        AbstractC167017dG.A1N(userSession, str);
        C1ON A0122 = AbstractC1571873x.A01(A013, userSession, str, null, str3, null, A04, A1H, A1H2, height, width);
        A0122.A00 = new C32523ETz(fragment, this, A0M, !z);
        c1gl.schedule(A0122);
    }

    @Override // X.InterfaceC58138Pq3
    public final ImageUrl AsN(Context context) {
        return this.A04;
    }
}
