package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class INT {
    public final Context A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final long A03;
    public final EnumC39636HiR A04;
    public final C153756vk A05;
    public final InterfaceC60442pS A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final java.util.Set A0A;

    public INT(Context context, FragmentActivity fragmentActivity, EnumC39636HiR enumC39636HiR, C153756vk c153756vk, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, long j) {
        C14360o3.A0B(userSession, 3);
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A02 = userSession;
        this.A06 = interfaceC60442pS;
        this.A05 = c153756vk;
        this.A08 = str;
        this.A07 = str2;
        this.A03 = j;
        this.A09 = str3;
        this.A04 = enumC39636HiR;
        this.A0A = AbstractC31171DnF.A0l();
    }

    public final SpannableStringBuilder A01(OriginalAudioSubtype originalAudioSubtype, List list) {
        Drawable A00;
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf = (OriginalAudioPartMetadataIntf) it.next();
            if (i > 0) {
                int length = A01.length();
                Context context = this.A00;
                A01.append((CharSequence) "  |  ");
                AbstractC37302Gc3.A0q(A01, new ForegroundColorSpan(context.getColor(AbstractC53242c7.A09(this.A01))), length);
            }
            String displayArtist = originalAudioPartMetadataIntf.getDisplayArtist();
            String displayTitle = originalAudioPartMetadataIntf.getDisplayTitle();
            int length2 = A01.length();
            String A0g = AnonymousClass001.A0g(displayArtist, " • ", displayTitle);
            C14360o3.A07(A0g);
            A01.append((CharSequence) A0g);
            AbstractC37302Gc3.A0q(A01, new C50766MbX(4, originalAudioSubtype, this, originalAudioPartMetadataIntf), length2);
            if (originalAudioPartMetadataIntf.isExplicit() && (A00 = A00()) != null) {
                A01.append((CharSequence) " ");
                C4GL.A02(A00, A01, A01.length(), 0, 0);
            }
            i = i2;
        }
        return A01;
    }

    public final Drawable A00() {
        Context context = this.A00;
        Drawable drawable = context.getDrawable(R.drawable.music_explicit);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            if (mutate != null) {
                mutate.setColorFilter(context.getColor(AbstractC53242c7.A08(this.A01)), PorterDuff.Mode.SRC_IN);
            }
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        return drawable;
    }

    public final void A02() {
        UserSession userSession = this.A02;
        InterfaceC60442pS interfaceC60442pS = this.A06;
        long j = this.A03;
        String str = this.A08;
        String str2 = this.A07;
        String str3 = this.A09;
        EnumC39636HiR enumC39636HiR = this.A04;
        C153756vk c153756vk = this.A05;
        AbstractC37670Gi3.A0F(enumC39636HiR, EnumC39652Hih.A0X, OriginalAudioSubtype.A06, c153756vk, interfaceC60442pS, userSession, str, str2, str3, 3, j, false);
        String sessionId = c153756vk.getSessionId();
        C8JW c8jw = c153756vk.A02;
        C14360o3.A0B(sessionId, 1);
        HCC hcc = new HCC();
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putString("ARGS_PIVOT_PAGE_SESSION_ID", sessionId);
        A05.putSerializable("ARGS_PIVOT_PAGE_ENTRY_POINT", c8jw);
        A05.putString("ARGS_MEDIA_ID", str);
        A05.putString("ARGS_MEDIA_AUTHOR_ID", str2);
        A05.putLong("ARGS_CONTAINER_ID", j);
        A05.putString("ARGS_MEDIA_TAP_TOKEN", str3);
        A05.putSerializable("ARGS_AUDIO_TYPE", enumC39636HiR);
        C189448aO A0W = AbstractC31174DnI.A0W(A05, hcc, userSession);
        A0W.A0d = this.A01.getText(2131955567);
        A0W.A0D = R.style.igds_emphasized_label;
        A0W.A1G = true;
        A0W.A0y = true;
        AbstractC25225BEi.A1Q(A0W, false);
        A0W.A00().A03(this.A00, hcc);
    }

    public final void A03(OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf, OriginalAudioSubtype originalAudioSubtype, int i, boolean z) {
        C8JW c8jw;
        UserSession userSession = this.A02;
        InterfaceC60442pS interfaceC60442pS = this.A06;
        long j = this.A03;
        AbstractC37670Gi3.A0F(this.A04, EnumC39652Hih.A0X, originalAudioSubtype, this.A05, interfaceC60442pS, userSession, this.A08, this.A07, this.A09, i, j, z);
        String A0j = AbstractC167017dG.A0j();
        if (originalAudioSubtype == OriginalAudioSubtype.A04) {
            c8jw = C8JW.A02;
        } else {
            c8jw = null;
        }
        AbstractC25228BEl.A1G(this.A01, AbstractC86593tX.A02(null, c8jw, AbstractC41763Iee.A02(originalAudioPartMetadataIntf), A0j), userSession, ModalActivity.class, "audio_page");
    }

    public final void A04(OriginalAudioSubtype originalAudioSubtype, int i, boolean z) {
        String str;
        if (this.A0A.add(Integer.valueOf(i))) {
            UserSession userSession = this.A02;
            InterfaceC60442pS interfaceC60442pS = this.A06;
            long j = this.A03;
            String str2 = this.A08;
            String str3 = this.A07;
            String str4 = this.A09;
            EnumC39636HiR enumC39636HiR = this.A04;
            C153756vk c153756vk = this.A05;
            EnumC39652Hih enumC39652Hih = EnumC39652Hih.A0X;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_organic_audio_page_audio_mix_song_impression");
            if (A0f.isSampled()) {
                AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
                AbstractC37301Gc2.A10(A0f, j);
                if (str4 == null) {
                    str4 = "";
                }
                AbstractC37300Gc1.A0p(A0f, str4);
                String str5 = null;
                AbstractC37300Gc1.A0h(A0f, AbstractC37302Gc3.A0W(str2));
                AbstractC37300Gc1.A0k(A0f, AbstractC37302Gc3.A0W(str3));
                A0f.A8R(enumC39636HiR, "audio_type");
                A0f.AAP("audio_sub_type", "mix");
                AbstractC37303Gc4.A0e(A0f, c153756vk);
                AbstractC25225BEi.A1M(enumC39652Hih, A0f);
                A0f.A9K("audio_mix_position", AbstractC31171DnF.A0V(i));
                if (z) {
                    str5 = "MULTI_TRACKS_OVERFLOW_SHEET";
                }
                A0f.AAP("overflow_sheet", str5);
                int ordinal = originalAudioSubtype.ordinal();
                if (ordinal != 3) {
                    if (ordinal != 1) {
                        str = null;
                    } else {
                        str = "partial_attribution";
                    }
                } else {
                    str = "multitrack";
                }
                A0f.AAP("contained_audio_relationship", str);
                A0f.Cht();
            }
        }
    }
}
