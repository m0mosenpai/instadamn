package com.instagram.igds.components.emptystate;

import X.C06090Tz;
import X.C14360o3;
import X.C14650od;
import X.C18U;
import X.C50823MdA;
import X.InterfaceC153246ut;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class IgdsEmptyState extends FrameLayout implements InterfaceC153246ut {
    public final View A00;
    public final InterfaceC153246ut A01;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsEmptyState(Context context) {
        this(context, null, 0, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // X.InterfaceC153246ut
    public final void CMY() {
        this.A01.CMY();
    }

    @Override // X.InterfaceC153246ut
    public final void EPC(View.OnClickListener onClickListener, int i) {
        this.A01.EPC(onClickListener, i);
    }

    @Override // X.InterfaceC153246ut
    public final void EW2(int i, boolean z) {
        this.A01.EW2(i, z);
    }

    @Override // X.InterfaceC153246ut
    public void setAction(String str, View.OnClickListener onClickListener) {
        this.A01.setAction(str, onClickListener);
    }

    @Override // X.InterfaceC153246ut
    public void setBody(int i) {
        this.A01.setBody(i);
    }

    @Override // X.InterfaceC153246ut
    public void setDetailText(CharSequence charSequence) {
        this.A01.setDetailText(charSequence);
    }

    @Override // X.InterfaceC153246ut
    public void setHeadline(int i) {
        this.A01.setHeadline(i);
    }

    @Override // X.InterfaceC153246ut
    public void setImageResource(int i) {
        this.A01.setImageResource(i);
    }

    @Override // X.InterfaceC153246ut
    public void setIsEmphasized(boolean z) {
        this.A01.setIsEmphasized(z);
    }

    @Override // X.InterfaceC153246ut
    public void setPrimaryButtonAction(String str, View.OnClickListener onClickListener) {
        this.A01.setPrimaryButtonAction(str, onClickListener);
    }

    @Override // X.InterfaceC153246ut
    public void setSecondaryButtonAction(String str, View.OnClickListener onClickListener) {
        this.A01.setSecondaryButtonAction(str, onClickListener);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.A00.setVisibility(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsEmptyState(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // X.InterfaceC153246ut
    public void setBody(CharSequence charSequence) {
        this.A01.setBody(charSequence);
    }

    @Override // X.InterfaceC153246ut
    public void setHeadline(CharSequence charSequence) {
        this.A01.setHeadline(charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.6ut] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public IgdsEmptyState(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ?? r0;
        C14360o3.A0B(context, 1);
        C14650od c14650od = C14650od.A03;
        if (c14650od != null) {
            boolean A06 = C18U.A06(C06090Tz.A05, C14650od.A00(c14650od), 36320296452432220L);
            if (Boolean.valueOf(A06) != null && A06) {
                r0 = new C50823MdA(context, attributeSet, i, i2);
                this.A01 = r0;
                View view = (View) r0;
                this.A00 = view;
                addView(view);
            }
        }
        r0 = new IgdsHeadline(context, attributeSet, i, i2);
        this.A01 = r0;
        View view2 = (View) r0;
        this.A00 = view2;
        addView(view2);
    }

    public /* synthetic */ IgdsEmptyState(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsEmptyState(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        C14360o3.A0B(context, 1);
    }
}
