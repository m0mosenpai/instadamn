package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.6fP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC144436fP implements View.OnClickListener, Animator.AnimatorListener, InterfaceC69513Al {
    public int A00 = 8;
    public View A01;
    public View A02;
    public View A03;
    public ViewGroup A04;
    public TextView A05;
    public IgTextView A06;
    public CircularImageView A07;
    public InterfaceC144686fo A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public final C57012jc A0D;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.A00 == 8) {
            this.A0D.A03(8);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.A0D.A03(0);
    }

    public ViewOnClickListenerC144436fP(ViewStub viewStub) {
        C57012jc c57012jc = new C57012jc(viewStub);
        this.A0D = c57012jc;
        c57012jc.A02 = this;
    }

    @Override // X.InterfaceC69513Al
    public final void DLu(View view) {
        this.A07 = (CircularImageView) view.findViewById(R.id.suggested_highlight_end_card_cover_image);
        this.A05 = (TextView) view.findViewById(R.id.suggested_highlight_end_card_title);
        this.A0B = view.findViewById(R.id.suggested_highlight_end_card_publish_button);
        this.A0C = view.findViewById(R.id.suggested_highlight_end_card_remove_suggestion_button);
        this.A0A = view.findViewById(R.id.end_of_year_end_card_publish_button);
        this.A04 = (ViewGroup) view.findViewById(R.id.end_of_year_end_card_container);
        this.A09 = view.findViewById(R.id.birthday_highlight_end_card_share_button);
        this.A03 = view.findViewById(R.id.superlative_end_card_share_to_story_button);
        this.A02 = view.findViewById(R.id.superlative_end_card_share_full_story_button);
        this.A01 = view.findViewById(R.id.superlative_end_card_back_to_story_button);
        this.A06 = (IgTextView) view.findViewById(R.id.superlative_end_card_subtitle);
        View view2 = this.A0B;
        if (view2 != null) {
            C0fQ.A00(this, view2);
        }
        View view3 = this.A0C;
        if (view3 != null) {
            C0fQ.A00(this, view3);
        }
        View view4 = this.A0A;
        if (view4 != null) {
            C0fQ.A00(this, view4);
        }
        View view5 = this.A09;
        if (view5 != null) {
            C0fQ.A00(this, view5);
        }
        View view6 = this.A03;
        if (view6 != null) {
            C0fQ.A00(this, view6);
        }
        View view7 = this.A01;
        if (view7 != null) {
            C0fQ.A00(this, view7);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-317438823);
        if (view == this.A0B) {
            InterfaceC144686fo interfaceC144686fo = this.A08;
            interfaceC144686fo.getClass();
            interfaceC144686fo.DcS();
        } else if (view == this.A0C) {
            InterfaceC144686fo interfaceC144686fo2 = this.A08;
            interfaceC144686fo2.getClass();
            interfaceC144686fo2.Df7();
        } else if (view == this.A0A) {
            InterfaceC144686fo interfaceC144686fo3 = this.A08;
            interfaceC144686fo3.getClass();
            interfaceC144686fo3.DDd();
        } else if (view == this.A09) {
            InterfaceC144686fo interfaceC144686fo4 = this.A08;
            interfaceC144686fo4.getClass();
            interfaceC144686fo4.DVp();
        } else if (view == this.A03) {
            InterfaceC144686fo interfaceC144686fo5 = this.A08;
            interfaceC144686fo5.getClass();
            interfaceC144686fo5.Dll();
        } else if (view == this.A01) {
            InterfaceC144686fo interfaceC144686fo6 = this.A08;
            interfaceC144686fo6.getClass();
            interfaceC144686fo6.Cyy();
        }
        C0f9.A0C(-85488644, A05);
    }
}
