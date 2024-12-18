package X;

import android.content.Context;
import android.os.Handler;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.80L, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C80L implements InterfaceC60152ox {
    public long A00;
    public C6RB A01;
    public int A02;
    public int A03;
    public int A04;
    public C80O A05;
    public final Handler A06;
    public final EditText A07;
    public final InterfaceC56392iX A08;
    public final C190398bx A09;
    public final Runnable A0A;
    public final Runnable A0B;

    public C80L(Context context, Handler handler, EditText editText, UserSession userSession, InterfaceC56392iX interfaceC56392iX, C190398bx c190398bx) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(editText, 3);
        C14360o3.A0B(interfaceC56392iX, 4);
        C14360o3.A0B(handler, 5);
        this.A07 = editText;
        this.A08 = interfaceC56392iX;
        this.A06 = handler;
        this.A09 = c190398bx;
        this.A0B = new Runnable() { // from class: X.80M
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC202988yG abstractC202988yG;
                int currentTimeMillis;
                C80L c80l = C80L.this;
                C6RB c6rb = c80l.A01;
                if (c6rb != null) {
                    InterfaceC56392iX interfaceC56392iX2 = c80l.A08;
                    if (interfaceC56392iX2.CWW()) {
                        if ((c6rb instanceof AbstractC202988yG) && (abstractC202988yG = (AbstractC202988yG) c6rb) != null) {
                            int A0W = abstractC202988yG.A0W();
                            if (A0W == 0) {
                                currentTimeMillis = 0;
                            } else {
                                currentTimeMillis = (int) ((System.currentTimeMillis() - c80l.A00) % A0W);
                            }
                            abstractC202988yG.EUp(currentTimeMillis, abstractC202988yG.getDurationInMs());
                        } else if (c6rb.A0I != null) {
                            c6rb.invalidateSelf();
                        }
                        interfaceC56392iX2.getView().postOnAnimation(c80l.A0B);
                    }
                }
            }
        };
        this.A0A = new Runnable() { // from class: X.80N
            @Override // java.lang.Runnable
            public final void run() {
                C80L.A01(C80L.this);
            }
        };
        if (!interfaceC56392iX.CWW()) {
            interfaceC56392iX.getView();
        }
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36323075293391778L) || C18U.A06(c06090Tz, userSession, 36323075293785000L)) {
            View findViewById = interfaceC56392iX.getView().findViewById(R.id.text_animation_preview_view);
            C14360o3.A07(findViewById);
            ((ViewGroup) interfaceC56392iX.getView()).removeView(findViewById);
            C80O c80o = new C80O(userSession, context);
            this.A05 = c80o;
            c80o.setId(R.id.text_animation_preview_view);
            AbstractC13880nE.A0q(editText, new Runnable() { // from class: X.80R
                @Override // java.lang.Runnable
                public final void run() {
                    C80L c80l = C80L.this;
                    View view = c80l.A08.getView();
                    EditText editText2 = c80l.A07;
                    view.setPadding(editText2.getPaddingLeft(), 0, editText2.getPaddingRight(), 0);
                }
            });
            ((ViewGroup) interfaceC56392iX.getView()).addView(c80o);
        }
    }

    public static final void A00(C80L c80l) {
        AbstractC202988yG abstractC202988yG;
        C80O c80o = c80l.A05;
        if (c80o != null) {
            c80o.A00();
        }
        EditText editText = c80l.A07;
        editText.setAlpha(1.0f);
        editText.setCursorVisible(true);
        Editable text = editText.getText();
        C14360o3.A07(text);
        C202888y6[] c202888y6Arr = (C202888y6[]) C4GL.A06(text, C202888y6.class);
        for (C202888y6 c202888y6 : c202888y6Arr) {
            c202888y6.A04 = true;
        }
        Editable text2 = editText.getText();
        C14360o3.A07(text2);
        C6S5 A00 = AbstractC190978ct.A00(text2, 0, text2.length());
        Editable text3 = editText.getText();
        C14360o3.A07(text3);
        C190868ci[] c190868ciArr = (C190868ci[]) C4GL.A06(text3, C190868ci.class);
        for (C190868ci c190868ci : c190868ciArr) {
            c190868ci.A03 = 255;
        }
        if (A00 == C6S5.A08 || A00 == C6S5.A07) {
            for (C190868ci c190868ci2 : c190868ciArr) {
                c190868ci2.A04 = true;
            }
        }
        InterfaceC56392iX interfaceC56392iX = c80l.A08;
        interfaceC56392iX.setVisibility(8);
        C6RB c6rb = c80l.A01;
        if ((c6rb instanceof AbstractC202988yG) && (abstractC202988yG = (AbstractC202988yG) c6rb) != null) {
            abstractC202988yG.A0Y();
        }
        c80l.A01 = null;
        if (interfaceC56392iX.CWW()) {
            interfaceC56392iX.getView().removeCallbacks(c80l.A0B);
        }
    }

    public static final void A01(C80L c80l) {
        float f;
        AbstractC202988yG abstractC202988yG;
        C80O c80o = c80l.A05;
        if (c80o != null) {
            c80o.A00();
        }
        C190398bx c190398bx = c80l.A09;
        if (c190398bx.A0j()) {
            EditText editText = c80l.A07;
            editText.setAlpha(0.0f);
            editText.setCursorVisible(false);
            editText.setSelection(editText.length());
            Editable text = editText.getText();
            C14360o3.A07(text);
            C202888y6[] c202888y6Arr = (C202888y6[]) C4GL.A06(text, C202888y6.class);
            for (C202888y6 c202888y6 : c202888y6Arr) {
                c202888y6.A04 = false;
            }
            C6RB c6rb = c80l.A01;
            if ((c6rb instanceof AbstractC202988yG) && (abstractC202988yG = (AbstractC202988yG) c6rb) != null) {
                abstractC202988yG.A0Y();
            }
            C6RB A03 = C190398bx.A03(c190398bx, ((C194918js) c190398bx.A1g.get()).A07());
            c190398bx.A0f(A03);
            AbstractC209689Pe.A0B(A03, ((C202968yE) c190398bx.A1Z.get()).A00);
            StaticLayout staticLayout = A03.A0G;
            if (staticLayout != null) {
                AbstractC209689Pe.A03(staticLayout, A03.A0F, AbstractC23070AFc.A00.A00(A03.A0E), A03.A0b.getTextSize());
            }
            if (A03 instanceof V7K) {
                f = ((AbstractC202988yG) A03).A0V() + 0.0f;
            } else {
                f = 0.0f;
            }
            C6RC c6rc = A03.A0I;
            if (c6rc != null) {
                f += AbstractC23029ADl.A01(c6rc, A03.A0b.getTextSize());
            }
            A03.A0C(0.0f, f);
            c80l.A01 = A03;
            InterfaceC56392iX interfaceC56392iX = c80l.A08;
            interfaceC56392iX.setVisibility(0);
            C6RB c6rb2 = c80l.A01;
            if (c6rb2 != null) {
                c80l.A02 = c6rb2.A06;
                c80l.A03 = C1H4.A01(c6rb2.A00);
                c80l.A04 = C1H4.A01(c6rb2.A01);
                ImageView imageView = (ImageView) interfaceC56392iX.getView().findViewById(R.id.text_animation_preview_view);
                imageView.setImageDrawable(c6rb2);
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                Layout.Alignment alignment = c6rb2.A0E;
                C14360o3.A07(alignment);
                int i = AbstractC22789A3h.A00[alignment.ordinal()];
                int i2 = 3;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            i2 = 5;
                        } else {
                            throw new RuntimeException();
                        }
                    }
                } else {
                    i2 = 1;
                }
                layoutParams2.gravity = i2;
                AbstractC13880nE.A0q(interfaceC56392iX.getView(), new RunnableC24424As5(c80l));
            }
            interfaceC56392iX.getView().requestLayout();
            if (interfaceC56392iX.CWW()) {
                interfaceC56392iX.getView().postOnAnimation(c80l.A0B);
            }
            c80l.A00 = System.currentTimeMillis();
        }
    }

    public static final void A02(C80L c80l) {
        InterfaceC56392iX interfaceC56392iX = c80l.A08;
        if (interfaceC56392iX.CGb() == 0) {
            int i = c80l.A02;
            EditText editText = c80l.A07;
            interfaceC56392iX.getView().setY(editText.getY() - ((i - editText.getHeight()) / 2));
            interfaceC56392iX.getView().setScaleX(editText.getScaleX());
            interfaceC56392iX.getView().setScaleY(editText.getScaleY());
            interfaceC56392iX.getView().setPadding(editText.getPaddingLeft() - c80l.A03, editText.getPaddingTop() - c80l.A04, editText.getPaddingRight() - c80l.A03, editText.getPaddingBottom() - c80l.A04);
        }
    }

    public final void A03() {
        Handler handler = this.A06;
        Runnable runnable = this.A0A;
        handler.removeCallbacks(runnable);
        if (this.A09.A0j()) {
            handler.postDelayed(runnable, 1000L);
            A00(this);
        }
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        A02(this);
    }
}
