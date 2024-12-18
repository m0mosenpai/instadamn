package com.instagram.creation.sharesheet.preview;

import X.AbstractC111324zv;
import X.AbstractC13880nE;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C1H4;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.follow.FollowButtonBase;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class ClipsViewerPreviewView extends IgFrameLayout {
    public ViewGroup A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public ViewGroup A03;
    public ViewGroup A04;
    public final View A05;
    public final View A06;
    public final ViewGroup A07;
    public final ImageView A08;
    public final ImageView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final TextView A0E;
    public final IgImageView A0F;
    public final FollowButtonBase A0G;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClipsViewerPreviewView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    private final int getAttrDefaultWidth() {
        return C1H4.A01((AbstractC13880nE.A07(AbstractC166997dE.A0L(this)) - (AbstractC166997dE.A06(getResources()) * 2)) * 0.5f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b6, code lost:
    
        if (r3.length() <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0170, code lost:
    
        if (r1.size() <= 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003c, code lost:
    
        if (r37.length() == 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0182, code lost:
    
        if (r2.A0K == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ca, code lost:
    
        if (r20 != false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x031e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.InterfaceC11380iw r34, com.instagram.common.session.UserSession r35, X.C128175qm r36, java.lang.String r37, java.lang.String r38, float r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.sharesheet.preview.ClipsViewerPreviewView.A00(X.0iw, com.instagram.common.session.UserSession, X.5qm, java.lang.String, java.lang.String, float, boolean):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsViewerPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        View inflate = View.inflate(context, R.layout.layout_clips_viewer_media_info, this);
        this.A06 = inflate;
        this.A0F = AbstractC167007dF.A0T(inflate, R.id.profile_picture);
        this.A0E = AbstractC167007dF.A0N(inflate, R.id.username);
        this.A0G = (FollowButtonBase) AbstractC166997dE.A0R(inflate, R.id.user_follow_button);
        View A0U = AbstractC167017dG.A0U(inflate, R.id.like_row_stub);
        C14360o3.A0C(A0U, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) A0U;
        this.A07 = viewGroup;
        View A0U2 = AbstractC167017dG.A0U(viewGroup, R.id.like_row_like_count_facepile_stub);
        String A00 = AbstractC111324zv.A00(34);
        C14360o3.A0C(A0U2, A00);
        this.A09 = (ImageView) A0U2;
        this.A0C = AbstractC167007dF.A0N(viewGroup, R.id.like_row_textview_likes);
        this.A0D = AbstractC167007dF.A0N(inflate, R.id.like_count);
        this.A0B = AbstractC167007dF.A0N(inflate, R.id.comment_count);
        this.A05 = AbstractC166997dE.A0S(inflate, R.id.video_caption_container);
        this.A0A = AbstractC167007dF.A0N(inflate, R.id.video_caption);
        View A0U3 = AbstractC167017dG.A0U(inflate, R.id.music_album_art_stub);
        C14360o3.A0C(A0U3, A00);
        this.A08 = (ImageView) A0U3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClipsViewerPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ ClipsViewerPreviewView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
