package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.mediasize.GifUrlImpl;
import java.util.List;
import java.util.Random;

/* renamed from: X.Jnt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44568Jnt extends C2UU {
    public final Context A00;
    public final UserSession A01;
    public final List A02 = AbstractC166987dD.A1E();
    public final int A03;
    public final C47644L2d A04;

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        if (i != 1 && i != 2) {
            if (i == 3) {
                return new C44625JpV(AbstractC25227BEk.A0D(LayoutInflater.from(this.A00), viewGroup, R.layout.thread_gifs_drawer_random_item, false));
            }
            throw AbstractC166987dD.A14(AnonymousClass001.A0O("Unknown viewtype: ", i));
        }
        View inflate = LayoutInflater.from(this.A00).inflate(R.layout.thread_gifs_drawer_item, viewGroup, false);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        UserSession userSession = this.A01;
        C14360o3.A0A(inflate);
        return new C44692Jqb(inflate, userSession);
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        int i2 = c3oo.mItemViewType;
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                Random random = new Random();
                List list = this.A02;
                C45026JwH c45026JwH = (C45026JwH) list.get(random.nextInt(AbstractC31172DnG.A03(list, 1)));
                C14360o3.A0B(c45026JwH, 0);
                KKo.A00(AbstractC166987dD.A0s(((C44625JpV) c3oo).A00), this.A04, new C45026JwH(AbstractC1121154d.A00(c45026JwH.A01), AbstractC1121154d.A00(c45026JwH.A00), false), 8);
                return;
            }
            return;
        }
        C45026JwH c45026JwH2 = (C45026JwH) this.A02.get(i);
        C44692Jqb c44692Jqb = (C44692Jqb) c3oo;
        C47644L2d c47644L2d = this.A04;
        int i3 = this.A03;
        C14360o3.A0B(c45026JwH2, 0);
        IgImageView igImageView = c44692Jqb.A02;
        Context context = igImageView.getContext();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        igImageView.setLayoutParams(layoutParams);
        View view = c44692Jqb.A00;
        view.setLayoutParams(layoutParams);
        DirectAnimatedMedia directAnimatedMedia = c45026JwH2.A01;
        GifUrlImpl gifUrlImpl = directAnimatedMedia.A02;
        C14360o3.A0A(context);
        UserSession userSession = c44692Jqb.A01;
        String str = directAnimatedMedia.A05;
        float A04 = AbstractC43594JPz.A04(context);
        C74V A00 = C74U.A00(AbstractC46673Kkq.A00(gifUrlImpl), i3, 0, -1);
        int A09 = AbstractC167007dF.A09(context, R.attr.stickerLoadingStartColor);
        int A092 = AbstractC167007dF.A09(context, R.attr.stickerLoadingEndColor);
        Integer num = C05F.A01;
        igImageView.setImageDrawable(new C74P(context, userSession, A00, gifUrlImpl, (GifUrlImpl) null, num, str, A04, A09, A092, false));
        AbstractC56952jT.A04(igImageView, num);
        C3P9 A0s = AbstractC166987dD.A0s(view);
        A0s.A04 = new KKo(7, c47644L2d, c45026JwH2);
        A0s.A0A = C18U.A06(C06090Tz.A05, userSession, 2342174227764888790L);
        A0s.A00();
        LIE lie = c47644L2d.A02;
        UserSession userSession2 = lie.A06;
        InterfaceC11380iw interfaceC11380iw = c47644L2d.A00;
        String str2 = lie.A0D;
        String str3 = c45026JwH2.A00.A05;
        String str4 = lie.A04;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = c47644L2d.A03;
        C14360o3.A0B(str3, 3);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession2), "giphy_gif_impression");
        if (!A0f.isSampled()) {
            return;
        }
        A0f.AAP("gif_id", str3);
        if (str2 == null) {
            str2 = "";
        }
        A0f.AAP(AbstractC31670Dva.A00(), str2);
        A0f.A8I("timestamp", Double.valueOf(currentTimeMillis));
        A0f.AAP("response_id", str4);
        AbstractC31175DnJ.A1A(A0f, z);
        A0f.Cht();
    }

    public C44568Jnt(Context context, UserSession userSession, C47644L2d c47644L2d, int i) {
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = c47644L2d;
        this.A03 = i;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-156073584);
        int size = this.A02.size();
        C0f9.A0A(799955968, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        C0f9.A0A(1167586342, C0f9.A03(-1847529275));
        return 1;
    }
}
