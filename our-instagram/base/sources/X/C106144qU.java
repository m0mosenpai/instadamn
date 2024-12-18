package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.VideoView;
import com.facebook.R;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.4qU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106144qU extends C3OO {
    public C4F5 A00;
    public final View.OnAttachStateChangeListener A01;
    public final View.OnAttachStateChangeListener A02;
    public final View A03;
    public final IgFrameLayout A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final InterfaceC56392iX A07;
    public final NoteAvatarView A08;
    public final InterfaceC65626Tpm A09;
    public final /* synthetic */ C4FE A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C106144qU(View view, C4FE c4fe) {
        super(view);
        C14360o3.A0B(view, 2);
        this.A0A = c4fe;
        View findViewById = view.findViewById(R.id.pog_root_view);
        this.A03 = findViewById;
        View findViewById2 = view.findViewById(R.id.pog_avatar_view);
        C14360o3.A07(findViewById2);
        NoteAvatarView noteAvatarView = (NoteAvatarView) findViewById2;
        this.A08 = noteAvatarView;
        this.A05 = (IgTextView) view.findViewById(R.id.pog_name);
        this.A07 = AbstractC56372iV.A01(findViewById.findViewById(R.id.self_note_reactions_layout), false, false);
        this.A04 = (IgFrameLayout) view.findViewById(R.id.note_pill_container);
        this.A06 = (IgTextView) view.findViewById(R.id.note_pill_text);
        JYH jyh = new JYH(this, c4fe);
        this.A09 = jyh;
        this.A02 = new JYI(this, c4fe);
        this.A01 = new JYG(this);
        UserSession userSession = c4fe.A02;
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36326378123048791L)) {
            c4fe.A00.A09(jyh);
        }
        noteAvatarView.A0F(userSession);
        noteAvatarView.A0J.setBadgeOffset(noteAvatarView.getContext().getResources().getDimensionPixelOffset(R.dimen.abc_edit_text_inset_top_material));
        noteAvatarView.A01.setOnTouchListener(new JYJ(EnumC152696tw.POG, this));
        noteAvatarView.getNoteBubbleView().setOnTouchListener(new JYJ(EnumC152696tw.NOTE_BUBBLE, this));
        noteAvatarView.setLifecycle(c4fe.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        if (r5.A0O != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C216209hd A00(X.C4F5 r5, X.C106144qU r6, boolean r7) {
        /*
            java.util.List r1 = r5.A0M
            if (r1 == 0) goto L4d
            r0 = 10
            int r0 = X.AbstractC06950Ym.A1E(r1, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r1)
            r4.add(r0)
            goto L13
        L28:
            com.instagram.direct.inbox.notes.ui.NoteAvatarView r0 = r6.A08
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r0.getPromptPogAvatar()
            android.content.Context r2 = r0.getContext()
            X.C14360o3.A07(r2)
            X.4FE r0 = r6.A0A
            com.instagram.common.session.UserSession r3 = r0.A02
            int r1 = r4.size()
            r0 = 1
            if (r1 != r0) goto L45
            boolean r0 = r5.A0O
            r6 = 1
            if (r0 == 0) goto L46
        L45:
            r6 = 0
        L46:
            X.9hd r1 = new X.9hd
            r5 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L4d:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106144qU.A00(X.4F5, X.4qU, boolean):X.9hd");
    }

    private final void A01(ImageUrl imageUrl, User user) {
        C4FE c4fe = this.A0A;
        ImageUrl E8d = c4fe.A06.E8d(new C4GS(user.Bhu(), user.getId()));
        NoteAvatarView noteAvatarView = this.A08;
        noteAvatarView.A0J.A03(c4fe.A01, imageUrl, E8d, noteAvatarView.getContext().getResources().getDimensionPixelSize(R.dimen.action_button_min_width));
    }

    public static final void A02(C4F5 c4f5, C106144qU c106144qU) {
        SpannableString spannableString;
        NoteAvatarView noteAvatarView = c106144qU.A08;
        noteAvatarView.A0J.setVisibility(0);
        noteAvatarView.A0I.setVisibility(8);
        noteAvatarView.A0B.setVisibility(8);
        C4FE c4fe = c106144qU.A0A;
        C4FF c4ff = c4fe.A06;
        User user = c4f5.A0A;
        ImageUrl E8d = c4ff.E8d(new C4GS(user.Bhu(), user.getId()));
        List list = c4f5.A0I;
        User user2 = null;
        if (list != null) {
            user2 = (User) AbstractC001800i.A0J(list);
        }
        UserSession userSession = c4fe.A02;
        boolean A06 = JY1.A06(userSession, c4f5);
        if (A06) {
            noteAvatarView.setAlpha(0.5f);
            c106144qU.A01(E8d, C6C8.A05(userSession));
        } else if (user2 != null) {
            noteAvatarView.setAlpha(1.0f);
            c106144qU.A01(E8d, user2);
        } else {
            noteAvatarView.setAlpha(1.0f);
            noteAvatarView.A0J.A04(E8d, c4fe.A01);
        }
        if (c4f5.A0Q) {
            Context context = c106144qU.A03.getContext();
            C14360o3.A07(context);
            spannableString = AbstractC46781Kmc.A00(context);
        } else if (A06) {
            spannableString = new SpannableString(noteAvatarView.getContext().getString(2131956328));
        } else {
            IgFrameLayout igFrameLayout = c106144qU.A04;
            C14360o3.A06(igFrameLayout);
            igFrameLayout.setVisibility(8);
            return;
        }
        IgFrameLayout igFrameLayout2 = c106144qU.A04;
        C14360o3.A06(igFrameLayout2);
        igFrameLayout2.setVisibility(0);
        c106144qU.A06.setText(spannableString);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36321267112682773L) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36321267112551699L) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C4F5 r9, X.C106144qU r10) {
        /*
            X.4FE r8 = r10.A0A
            boolean r7 = r8.A09
            r4 = 1
            r5 = 0
            if (r7 != 0) goto L1f
            boolean r0 = r9.A0Y
            if (r0 != r4) goto L1f
            com.instagram.common.session.UserSession r3 = r8.A02
            X.C14360o3.A0B(r3, r5)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321267112551699(0x810a0000092513, double:3.033053803756638E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r6 = 1
            if (r0 != 0) goto L20
        L1f:
            r6 = 0
        L20:
            if (r7 == 0) goto L39
            boolean r0 = r9.A0V
            if (r0 == 0) goto L39
            com.instagram.common.session.UserSession r3 = r8.A02
            X.C14360o3.A0B(r3, r5)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321267112682773(0x810a00000b2515, double:3.03305380383953E-306)
            boolean r1 = X.C18U.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L3a
        L39:
            r0 = 0
        L3a:
            if (r6 != 0) goto L3e
            if (r0 == 0) goto La0
        L3e:
            com.instagram.common.ui.base.IgTextView r6 = r10.A05
            android.content.Context r8 = r6.getContext()
            r0 = 2130970849(0x7f0408e1, float:1.755042E38)
            int r0 = X.AbstractC53242c7.A0H(r8, r0)
            android.graphics.drawable.Drawable r7 = r8.getDrawable(r0)
            if (r7 == 0) goto La0
            android.graphics.drawable.Drawable r2 = r7.mutate()
            r0 = 2130970273(0x7f0406a1, float:1.7549251E38)
            int r0 = X.AbstractC53242c7.A0H(r8, r0)
            int r1 = r8.getColor(r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            r2 = 2131165195(0x7f07000b, float:1.79446E38)
            int r1 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r0 = r8.getResources()
            int r0 = r0.getDimensionPixelSize(r2)
            r7.setBounds(r5, r5, r1, r0)
            java.lang.CharSequence r0 = r6.getText()
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r0)
            int r2 = r3.length()
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.C4GL.A02(r7, r3, r2, r0, r5)
            r6.setText(r3)
            r0 = 0
            r6.setTypeface(r0, r4)
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106144qU.A03(X.4F5, X.4qU):void");
    }

    public static final void A04(C106144qU c106144qU) {
        NoteAvatarView noteAvatarView = c106144qU.A08;
        noteAvatarView.A02.setVisibility(8);
        noteAvatarView.A02.removeOnAttachStateChangeListener(c106144qU.A01);
        UserSession userSession = c106144qU.A0A.A02;
        C06090Tz c06090Tz = C06090Tz.A05;
        if ((!C18U.A06(c06090Tz, userSession, 36318033005713250L) && ((int) C18U.A01(c06090Tz, userSession, 36604880986248333L)) <= 0) || noteAvatarView.A0F.CWW()) {
            VideoView videoView = (VideoView) noteAvatarView.A0F.getView();
            videoView.setVideoURI(null);
            videoView.removeOnAttachStateChangeListener(c106144qU.A02);
            videoView.setOnPreparedListener(null);
            videoView.setOnErrorListener(null);
        }
    }

    public static final boolean A05(C4F5 c4f5) {
        List list;
        NotePogVideoDict notePogVideoDict = c4f5.A08;
        if (notePogVideoDict != null && (list = notePogVideoDict.A03) != null && (!list.isEmpty())) {
            List list2 = c4f5.A0J;
            if (list2.size() == 1 && C9BI.A00(list2.get(0), 6)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A06(C4F5 c4f5, C106144qU c106144qU) {
        return C14360o3.A0K(c4f5.A0A.getId(), C08730cb.A00(c106144qU.A0A.A02).A00().getId());
    }
}
