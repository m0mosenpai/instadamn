package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.textview.ImageWithTitleTextView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class V1E extends AbstractC59962oe implements JPX {
    public static final String __redex_internal_original_name = "HashtagSheetFragment";
    public View A00;
    public UserSession A01;
    public C63822v3 A02;
    public HashtagFollowButton A03;
    public Hashtag A04;
    public AbstractC140596Xn A05;
    public C69314VlM A06;
    public C69178Vj7 A07;
    public String A08;
    public String A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public C69425VnA A0D;
    public C69147Vic A0E;
    public final C1P1 A0G = new V3X(this, 0);
    public final C1P1 A0I = new V3X(this, 1);
    public final C1P1 A0H = new V3X(this, 2);
    public final X8S A0K = new C70989Wlz(this);
    public final GZ9 A0F = new C70930WkZ(this, 3);
    public final InterfaceC71930XAy A0J = new C70987Wlx(this);

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.VJU, java.lang.Object] */
    public static void A00(V1E v1e) {
        Drawable drawable;
        Integer num;
        String A0r;
        C69314VlM c69314VlM = v1e.A06;
        ImageUrl imageUrl = c69314VlM.A01;
        if (imageUrl != null) {
            num = C05F.A0C;
            drawable = null;
        } else {
            drawable = c69314VlM.A00;
            num = C05F.A01;
            imageUrl = null;
        }
        ?? obj = new Object();
        obj.A02 = num;
        obj.A01 = imageUrl;
        obj.A00 = drawable;
        C70986Wlw c70986Wlw = new C70986Wlw(v1e, 0);
        String str = c69314VlM.A04;
        C14360o3.A0B(str, 0);
        String A0D = AnonymousClass001.A0D(str, '#');
        C69314VlM c69314VlM2 = v1e.A06;
        Reel reel = c69314VlM2.A02;
        InterfaceC71930XAy interfaceC71930XAy = v1e.A0J;
        if (c69314VlM2.A03 == null) {
            A0r = null;
        } else {
            A0r = AbstractC166997dE.A0r(AbstractC166997dE.A0N(v1e), v1e.A06.A03, 2131963454);
        }
        VW1.A00(v1e.requireContext(), v1e, v1e.A01, new C69447VnW(reel, c70986Wlw, obj, interfaceC71930XAy, A0r, null, A0D, null, false, false, false), v1e.A0D);
        C69147Vic c69147Vic = v1e.A0E;
        C69148Vid c69148Vid = new C69148Vid(v1e.A0K, v1e.A0A);
        ArrayList arrayList = c69148Vid.A01;
        if (arrayList != null) {
            int min = Math.min(3, arrayList.size());
            for (int i = 0; i < min; i++) {
                C0fQ.A00(new WMR(c69148Vid, i, 4), c69147Vic.A02[i]);
            }
        }
        c69147Vic.A00.setVisibility(0);
        if (arrayList != null) {
            int min2 = Math.min(3, arrayList.size());
            if (min2 > 0) {
                c69147Vic.A01.A03(8);
                IgImageView[] igImageViewArr = c69147Vic.A02;
                int i2 = 0;
                do {
                    igImageViewArr[i2].setVisibility(4);
                    i2++;
                } while (i2 < 3);
                int i3 = 0;
                do {
                    ArrayList arrayList2 = c69148Vid.A00;
                    if (arrayList2 != null) {
                        igImageViewArr[i3].A05 = ((Number) arrayList2.get(i3)).longValue();
                    }
                    igImageViewArr[i3].setUrl((ImageUrl) arrayList.get(i3), v1e);
                    igImageViewArr[i3].setVisibility(0);
                    i3++;
                } while (i3 < min2);
            } else {
                IgImageView[] igImageViewArr2 = c69147Vic.A02;
                int i4 = 0;
                do {
                    igImageViewArr2[i4].setVisibility(8);
                    i4++;
                } while (i4 < 3);
                C57012jc c57012jc = c69147Vic.A01;
                c57012jc.A03(0);
                View A01 = c57012jc.A01();
                TextView textView = (TextView) A01.requireViewById(R.id.empty_state_view_title);
                textView.setText(2131966137);
                textView.setVisibility(0);
                ImageView imageView = (ImageView) A01.requireViewById(R.id.empty_state_view_image);
                imageView.setImageResource(R.drawable.empty_state_camera);
                imageView.setVisibility(0);
            }
        }
        v1e.A00.setVisibility(8);
        if (v1e.A0B && v1e.A0C) {
            v1e.A00.setVisibility(0);
            v1e.A03.setTextSize(2, 14.0f);
            HashtagFollowButton hashtagFollowButton = v1e.A03;
            ((ImageWithTitleTextView) hashtagFollowButton).A00 = 0;
            hashtagFollowButton.setTypeface(null, 1);
            HashtagFollowButton hashtagFollowButton2 = v1e.A03;
            hashtagFollowButton2.setIsBlueButton(false);
            AbstractC13880nE.A0a(hashtagFollowButton2, 0);
            v1e.A03.A01(v1e, v1e.A0F, v1e.A04);
        }
    }

    @Override // X.JPX
    public final Integer BlT() {
        return C05F.A03;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return I58.A00(this, this.A08);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String encode;
        int A02 = C0f9.A02(-1589643806);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = AbstractC31176DnK.A0S(this);
        Parcelable parcelable = requireArguments.getParcelable(AbstractC111324zv.A00(3946));
        parcelable.getClass();
        this.A04 = (Hashtag) parcelable;
        String string = requireArguments.getString(AbstractC111324zv.A00(44));
        string.getClass();
        this.A08 = string;
        this.A09 = AbstractC166997dE.A0n();
        Context requireContext = requireContext();
        C08790ch A00 = AbstractC018607g.A00(this);
        UserSession userSession = this.A01;
        C63822v3 c63822v3 = new C63822v3(requireContext, A00, this, userSession);
        this.A02 = c63822v3;
        String name = this.A04.getName();
        C1P1 c1p1 = this.A0H;
        C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
        if (name == null) {
            encode = "";
        } else {
            encode = android.net.Uri.encode(name.trim());
        }
        A0N.A0B(AbstractC13670mt.A06("tags/%s/story_tags_info/", encode));
        C1ON A0S = AbstractC31172DnG.A0S(A0N, C67818Uyr.class, IQP.class);
        A0S.A00 = c1p1;
        C1GJ.A00(c63822v3.A00, c63822v3.A01, A0S);
        this.A06 = new C69314VlM(null, null, null, this.A04.getName(), this.A04.B8G());
        C0f9.A09(2086299478, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-152804331);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.hashtag_sheet_fragment);
        C0f9.A09(-1079938840, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-730235223);
        super.onDestroyView();
        this.A05 = null;
        C0f9.A09(1404554557, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1559046766);
        super.onResume();
        this.A02.A04(this.A0G, this.A01, this.A04.getName());
        C0f9.A09(1087946898, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A0D = new C69425VnA((ViewGroup) view.requireViewById(R.id.header_container));
        this.A00 = view.requireViewById(R.id.follow_button_container);
        HashtagFollowButton hashtagFollowButton = (HashtagFollowButton) view.requireViewById(R.id.hashtag_follow_button);
        this.A03 = hashtagFollowButton;
        hashtagFollowButton.setVisibility(0);
        this.A0E = new C69147Vic((ViewGroup) view.requireViewById(R.id.media_preview_grid));
        A00(this);
    }
}
