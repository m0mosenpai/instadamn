package X;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.NoteActivationType;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;

/* renamed from: X.Jrp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44768Jrp extends C3OO {
    public final TextView A00;
    public final FragmentActivity A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final IgSimpleImageView A04;
    public final IgSimpleImageView A05;
    public final IgImageView A06;
    public final IgImageView A07;
    public final IgImageView A08;
    public final IgImageView A09;
    public final IgImageView A0A;
    public final C4F7 A0B;
    public final NoteBubbleView A0C;

    public static final void A00(NoteCustomTheme noteCustomTheme, C44768Jrp c44768Jrp) {
        int color;
        NoteActivationType noteActivationType;
        String Aev;
        c44768Jrp.A0C.setCustomTheme(noteCustomTheme);
        boolean z = true;
        int i = 0;
        if (noteCustomTheme != null && (Aev = noteCustomTheme.Aev()) != null && Aev.length() != 0) {
            color = Color.parseColor(noteCustomTheme.Aev());
        } else {
            Context A05 = AbstractC31172DnG.A05(c44768Jrp);
            color = A05.getColor(AbstractC53242c7.A02(A05));
        }
        AbstractC166997dE.A1F(c44768Jrp.A07.getBackground(), color);
        if (noteCustomTheme != null) {
            noteActivationType = noteCustomTheme.AYn();
        } else {
            noteActivationType = null;
        }
        if (noteActivationType != NoteActivationType.A0A) {
            z = false;
        }
        IgSimpleImageView igSimpleImageView = c44768Jrp.A04;
        if (!z) {
            i = 8;
        }
        igSimpleImageView.setVisibility(i);
    }

    public static final void A01(C4FM c4fm, C44768Jrp c44768Jrp) {
        TextView textView;
        String string;
        String valueOf;
        int i = c4fm.A02;
        if (i > 0) {
            long A01 = C18U.A01(C06090Tz.A05, c44768Jrp.A03, 36609639806474181L);
            if (i > A01) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append(A01);
                A1C.append('+');
                valueOf = A1C.toString();
            } else {
                valueOf = String.valueOf(i);
            }
            textView = c44768Jrp.A00;
            string = AbstractC31175DnJ.A0W(AbstractC25228BEl.A0M(textView), valueOf, R.plurals.media_note_stack_label, i);
        } else {
            textView = c44768Jrp.A00;
            string = AbstractC25228BEl.A0M(textView).getString(2131966094);
        }
        textView.setText(string);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0055, code lost:
    
        if (X.C18U.A06(r2, r3, 36328164829969685L) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0077, code lost:
    
        if (r6.A0G != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C4FM r6, X.C44768Jrp r7, java.lang.String r8, java.lang.String r9, boolean r10, boolean r11) {
        /*
            com.instagram.common.session.UserSession r3 = r7.A03
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.A0M
            X.5Qr r4 = new X.5Qr
            r4.<init>(r0, r3)
            r0 = 1
            r4.A1Q = r0
            java.lang.String r0 = "clips_media_notes_stack"
            r4.A0q = r0
            r4.A1s = r11
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 2342171174043401491(0x2081104600043d13, double:4.072508963226307E-152)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r4.A1o = r0
            r0 = 2342171174043794711(0x20811046000a3d17, double:4.072508963559724E-152)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r4.A1y = r0
            r0 = 2342171174043729174(0x2081104600093d16, double:4.072508963504154E-152)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r4.A1v = r0
            r0 = 2342171174043860248(0x20811046000b3d18, double:4.072508963615294E-152)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r4.A1w = r0
            r0 = 36328164829904148(0x81104600073d14, double:3.037415947985205E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L57
            r0 = 36328164829969685(0x81104600083d15, double:3.037415948026651E-306)
            boolean r1 = X.C18U.A06(r2, r3, r0)
            r0 = 0
            if (r1 == 0) goto L58
        L57:
            r0 = 1
        L58:
            r4.A1r = r0
            r0 = 2342171174043729174(0x2081104600093d16, double:4.072508963504154E-152)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r0 = r0 ^ 1
            r4.A1d = r0
            r4.A0m = r8
            r0 = 2342171174044056859(0x20811046000e3d1b, double:4.072508963782003E-152)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L79
            boolean r1 = r6.A0G
            r0 = r9
            if (r1 == 0) goto L7a
        L79:
            r0 = 0
        L7a:
            r4.A1D = r0
            r0 = 36609639807129543(0x821046000f17c7, double:3.2154218569913044E-306)
            java.lang.Long r0 = X.AbstractC166997dE.A0i(r2, r3, r0)
            r4.A0b = r0
            r4.A0n = r9
            com.instagram.clips.intf.ClipsViewerConfig r1 = r4.A00()
            androidx.fragment.app.FragmentActivity r0 = r7.A01
            X.AbstractC86593tX.A0Y(r0, r1, r3)
            X.1Ai r4 = X.AbstractC23021Ah.A00(r3)
            long r0 = java.lang.System.currentTimeMillis()
            X.0xo r5 = X.AbstractC166987dD.A0w(r4)
            java.lang.String r4 = "last_media_note_stack_open_time"
            r5.E7G(r4, r0)
            r5.apply()
            if (r10 == 0) goto Lc1
            boolean r0 = r6.A0F
            if (r0 == 0) goto Lc1
            r0 = 2342171174043270417(0x2081104600023d11, double:4.072508963115167E-152)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto Lc1
            A01(r6, r7)
            android.widget.TextView r2 = r7.A00
            r1 = 0
            r0 = 0
            r2.setTypeface(r1, r0)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44768Jrp.A02(X.4FM, X.Jrp, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44768Jrp(View view, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C4F7 c4f7) {
        super(view);
        JQ0.A1O(view, userSession, fragmentActivity, interfaceC11380iw, c4f7);
        this.A03 = userSession;
        this.A01 = fragmentActivity;
        this.A02 = interfaceC11380iw;
        this.A0B = c4f7;
        this.A08 = AbstractC31172DnG.A0a(view, R.id.media_note_stack_cover_image_front);
        this.A06 = AbstractC31172DnG.A0a(view, R.id.media_note_stack_cover_image_back);
        this.A00 = AbstractC166987dD.A0e(view, R.id.media_note_stack_item_label);
        this.A0A = AbstractC37302Gc3.A0K(view, R.id.media_note_stack_pogs);
        this.A09 = AbstractC37302Gc3.A0K(view, R.id.media_note_author_pog);
        NoteBubbleView noteBubbleView = (NoteBubbleView) AbstractC166987dD.A0c(view, R.id.pog_note_bubble_view);
        this.A0C = noteBubbleView;
        this.A07 = AbstractC37302Gc3.A0K(view, R.id.filled_like_view);
        this.A05 = (IgSimpleImageView) AbstractC166987dD.A0c(view, R.id.like_animation_image_view);
        View findViewById = view.findViewById(R.id.note_custom_activation_view);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) findViewById;
        igSimpleImageView.setBackground(new C93Q());
        C14360o3.A07(findViewById);
        this.A04 = igSimpleImageView;
        noteBubbleView.A0J(C85363rR.A00.A09(userSession), C85363rR.A06(userSession), C85363rR.A07(userSession), C85363rR.A04(userSession));
    }
}
