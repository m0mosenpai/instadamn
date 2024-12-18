package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.Fo4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35613Fo4 implements View.OnClickListener {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ GZ9 A01;
    public final /* synthetic */ HashtagFollowButton A02;
    public final /* synthetic */ Hashtag A03;
    public final /* synthetic */ boolean A04;

    public ViewOnClickListenerC35613Fo4(InterfaceC11380iw interfaceC11380iw, GZ9 gz9, HashtagFollowButton hashtagFollowButton, Hashtag hashtag, boolean z) {
        this.A02 = hashtagFollowButton;
        this.A04 = z;
        this.A03 = hashtag;
        this.A00 = interfaceC11380iw;
        this.A01 = gz9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(777057186);
        if (this.A04) {
            HashtagFollowButton hashtagFollowButton = this.A02;
            Hashtag hashtag = this.A03;
            InterfaceC11380iw interfaceC11380iw = this.A00;
            GZ9 gz9 = this.A01;
            Context context = hashtagFollowButton.getContext();
            SpannableStringBuilder A07 = AbstractC31178DnM.A07(context, hashtag.getName(), 2131976073);
            C193328hC A0I = AbstractC31171DnF.A0I(context);
            AbstractC35271Fh6.A0A(A07);
            A0I.A0r(A07);
            A0I.A0R(new DialogInterfaceOnClickListenerC35448Fk5(3, hashtagFollowButton, hashtag, interfaceC11380iw, gz9), EnumC193348hE.A05, 2131976069);
            DialogInterfaceOnClickListenerC35453FkA.A01(A0I, hashtagFollowButton, 38);
            if (hashtag.Bhu() != null) {
                A0I.A0o(hashtag.Bhu(), interfaceC11380iw);
            }
            AbstractC166987dD.A1W(A0I);
        } else {
            C69730VuP c69730VuP = new C69730VuP(this.A03);
            c69730VuP.A08 = 1;
            Hashtag A00 = c69730VuP.A00();
            HashtagFollowButton hashtagFollowButton2 = this.A02;
            InterfaceC11380iw interfaceC11380iw2 = this.A00;
            GZ9 gz92 = this.A01;
            hashtagFollowButton2.A01(interfaceC11380iw2, gz92, A00);
            gz92.D3r(A00);
        }
        C0f9.A0C(858511348, A05);
    }
}
