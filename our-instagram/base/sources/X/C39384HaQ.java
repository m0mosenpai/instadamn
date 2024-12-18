package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.text.TightTextView;

/* renamed from: X.HaQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39384HaQ extends AbstractC50789Mc6 {
    public ViewGroup A00;
    public ImageView A01;
    public ImageView A02;
    public TextView A03;
    public UserSession A04;
    public C38321qM A05;
    public InterfaceC43424JGo A06;
    public boolean A07;
    public final Resources A08;
    public final C25671My A09;

    @Override // X.AbstractC50789Mc6
    public C57482kN getTextLayoutParams() {
        return null;
    }

    @Override // X.AbstractC50789Mc6
    public CharSequence getText() {
        return this.A03.getText();
    }

    @Override // X.AbstractC50789Mc6
    public int getTextLineHeight() {
        return this.A03.getLineHeight();
    }

    public C39384HaQ(Context context, PointF pointF, UserSession userSession, C38321qM c38321qM, boolean z) {
        super(context);
        this.A08 = getResources();
        this.A09 = AbstractC25651Mw.A00(userSession);
        this.A04 = userSession;
        this.A05 = c38321qM;
        this.A07 = z;
        Context context2 = getContext();
        FrameLayout frameLayout = new FrameLayout(context2);
        this.A00 = frameLayout;
        AbstractC41736Ie8.A00(frameLayout, this.A04, this.A05, Boolean.valueOf(this.A07));
        TightTextView tightTextView = new TightTextView(context2);
        this.A03 = tightTextView;
        tightTextView.setMinimumWidth(this.A08.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material));
        AbstractC41736Ie8.A02(this.A03);
        ImageView imageView = new ImageView(context2);
        this.A02 = imageView;
        AbstractC41736Ie8.A01(imageView, true);
        ImageView imageView2 = new ImageView(context2);
        this.A01 = imageView2;
        AbstractC41736Ie8.A01(imageView2, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.A00.addView(this.A03, layoutParams);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
        addView(this.A00, layoutParams2);
        addView(this.A02, layoutParams2);
        addView(this.A01, layoutParams2);
        ViewGroup viewGroup = this.A00;
        TextView textView = this.A03;
        super.A02 = new OXO(pointF, viewGroup, this.A02, this.A01, textView, this.A04, this.A05, this, 0, 0, false);
    }

    private String getTagName() {
        return ((com.instagram.tagging.model.Tag) AbstractC31172DnG.A0x(this)).A04();
    }

    @Override // X.AbstractC50789Mc6
    public String getTaggedId() {
        return ((com.instagram.tagging.model.Tag) AbstractC31172DnG.A0x(this)).getId();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (((com.instagram.model.people.PeopleTag) getTag()).A02 == false) goto L13;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            r0 = -1049135035(0xffffffffc1777845, float:-15.466863)
            int r7 = X.C0f9.A05(r0)
            int r0 = r9.getAction()
            r6 = 1
            if (r0 != r6) goto L4d
            X.3Zb r2 = r8.A01
            if (r2 == 0) goto L1b
            int r1 = r8.A00
            r0 = -1
            X.3tC r0 = r2.A07(r1, r0)
            r0.A04 = r6
        L1b:
            X.1qM r5 = r8.getMedia()
            if (r5 == 0) goto L4d
            X.1My r4 = r8.A09
            java.lang.String r3 = r8.getTaggedId()
            r8.getTagName()
            java.lang.Object r0 = r8.getTag()
            boolean r0 = r0 instanceof com.instagram.model.people.PeopleTag
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r8.getTag()
            com.instagram.model.people.PeopleTag r0 = (com.instagram.model.people.PeopleTag) r0
            boolean r0 = r0.A02
            r2 = 1
            if (r0 != 0) goto L3e
        L3d:
            r2 = 0
        L3e:
            r0 = 27
            X.HGg r1 = new X.HGg
            r1.<init>(r8, r0)
            X.3Me r0 = new X.3Me
            r0.<init>(r1, r5, r3, r2)
            r4.E4s(r0)
        L4d:
            r0 = 1081925419(0x407cdf2b, float:3.951121)
            X.C0f9.A0C(r0, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39384HaQ.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // X.AbstractC50789Mc6
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
        this.A03.setContentDescription(AbstractC166997dE.A0r(getResources(), charSequence, 2131975175));
    }

    public void setListener(InterfaceC43424JGo interfaceC43424JGo) {
        this.A06 = interfaceC43424JGo;
    }
}
