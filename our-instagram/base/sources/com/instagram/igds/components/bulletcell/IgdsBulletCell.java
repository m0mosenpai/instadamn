package com.instagram.igds.components.bulletcell;

import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC53242c7;
import X.AbstractC55922hc;
import X.AbstractC56922jQ;
import X.B4Z;
import X.C14360o3;
import X.EnumC33418Epp;
import X.F87;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class IgdsBulletCell extends FrameLayout {
    public EnumC33418Epp A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final ViewGroup A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsBulletCell(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        EnumC33418Epp enumC33418Epp = EnumC33418Epp.A05;
        this.A00 = enumC33418Epp;
        View.inflate(context, R.layout.layout_bullet_cell, this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.bullet_cell_container);
        this.A04 = viewGroup;
        this.A01 = AbstractC31171DnF.A08(this, R.id.bullet_cell_icon);
        this.A03 = AbstractC166987dD.A0e(this, R.id.bullet_cell_title);
        this.A02 = AbstractC166987dD.A0e(this, R.id.bullet_cell_body);
        viewGroup.setImportantForAccessibility(1);
        viewGroup.setDescendantFocusability(393216);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC55922hc.A1O, i, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(2, 0);
                String A00 = AbstractC56922jQ.A00(context, obtainStyledAttributes, 4);
                String A002 = AbstractC56922jQ.A00(context, obtainStyledAttributes, 0);
                boolean z = obtainStyledAttributes.getBoolean(1, false);
                int i2 = obtainStyledAttributes.getInt(3, 0);
                if (i2 != 0 && i2 == 1) {
                    enumC33418Epp = EnumC33418Epp.A06;
                }
                setSurfaceType(enumC33418Epp);
                obtainStyledAttributes.recycle();
                setExcludeHorizontalPadding(z);
                if (resourceId != 0) {
                    this.A01.setImageResource(resourceId);
                }
                A00(this, A00, A002);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    public final void setIcon(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        this.A01.setImageDrawable(drawable);
    }

    public final void setSurfaceType(EnumC33418Epp enumC33418Epp) {
        EnumC33418Epp enumC33418Epp2;
        int A00;
        EnumC33418Epp enumC33418Epp3;
        C14360o3.A0B(enumC33418Epp, 0);
        if (this.A00 != enumC33418Epp) {
            this.A00 = enumC33418Epp;
            ImageView imageView = this.A01;
            Context A0L = AbstractC166997dE.A0L(this);
            int A05 = AbstractC25227BEk.A05(this.A00, 1);
            if (A05 != 0) {
                if (A05 == 1) {
                    enumC33418Epp2 = EnumC33418Epp.A06;
                } else {
                    throw B4Z.A00();
                }
            } else {
                enumC33418Epp2 = EnumC33418Epp.A05;
            }
            imageView.setColorFilter(AbstractC167007dF.A09(A0L, enumC33418Epp2.A00));
            TextView textView = this.A03;
            AbstractC166987dD.A1O(A0L, textView, F87.A00(A0L, this.A00));
            TextView textView2 = this.A02;
            int visibility = textView.getVisibility();
            EnumC33418Epp enumC33418Epp4 = this.A00;
            if (visibility == 0) {
                int A052 = AbstractC25227BEk.A05(enumC33418Epp4, 1);
                if (A052 != 0) {
                    if (A052 == 1) {
                        enumC33418Epp3 = EnumC33418Epp.A06;
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    enumC33418Epp3 = EnumC33418Epp.A05;
                }
                A00 = AbstractC53242c7.A0H(A0L, enumC33418Epp3.A02);
            } else {
                A00 = F87.A00(A0L, enumC33418Epp4);
            }
            AbstractC166987dD.A1O(A0L, textView2, A00);
        }
    }

    public final void setText(Integer num, Integer num2) {
        String str;
        int intValue;
        int intValue2;
        String str2 = null;
        if (num != null && (intValue2 = num.intValue()) != 0) {
            str = getContext().getString(intValue2);
        } else {
            str = null;
        }
        if (num2 != null && (intValue = num2.intValue()) != 0) {
            str2 = getContext().getString(intValue);
        }
        A00(this, str, str2);
    }

    public static final void A00(IgdsBulletCell igdsBulletCell, CharSequence charSequence, CharSequence charSequence2) {
        Context A0L;
        int A00;
        EnumC33418Epp enumC33418Epp;
        TextView textView = igdsBulletCell.A03;
        textView.setText(charSequence);
        TextView textView2 = igdsBulletCell.A02;
        textView2.setText(charSequence2);
        CharSequence text = textView.getText();
        C14360o3.A07(text);
        boolean A1Y = AbstractC25225BEi.A1Y(text);
        CharSequence text2 = textView2.getText();
        C14360o3.A07(text2);
        boolean A1Y2 = AbstractC25225BEi.A1Y(text2);
        if (A1Y2 && A1Y) {
            textView.setVisibility(0);
            Context A0L2 = AbstractC166997dE.A0L(textView);
            AbstractC13880nE.A0j(textView, (int) AbstractC13880nE.A00(A0L2, 12.0f), (int) AbstractC13880nE.A00(A0L2, 5.0f));
            textView2.setVisibility(0);
            A0L = AbstractC166997dE.A0L(textView2);
            AbstractC13880nE.A0Y(textView2, (int) AbstractC13880nE.A00(A0L, 12.0f));
            int A05 = AbstractC25227BEk.A05(igdsBulletCell.A00, 1);
            if (A05 != 0) {
                if (A05 == 1) {
                    enumC33418Epp = EnumC33418Epp.A06;
                } else {
                    throw B4Z.A00();
                }
            } else {
                enumC33418Epp = EnumC33418Epp.A05;
            }
            A00 = AbstractC53242c7.A0H(A0L, enumC33418Epp.A02);
        } else {
            if (A1Y) {
                textView.setVisibility(0);
                Context A0L3 = AbstractC166997dE.A0L(textView);
                AbstractC13880nE.A0j(textView, (int) AbstractC13880nE.A00(A0L3, 13.0f), (int) AbstractC13880nE.A00(A0L3, 13.0f));
                textView2.setVisibility(8);
                return;
            }
            if (!A1Y2) {
                return;
            }
            textView.setVisibility(8);
            textView2.setVisibility(0);
            A0L = AbstractC166997dE.A0L(textView2);
            AbstractC13880nE.A0j(textView2, (int) AbstractC13880nE.A00(A0L, 13.0f), (int) AbstractC13880nE.A00(A0L, 13.0f));
            A00 = F87.A00(A0L, igdsBulletCell.A00);
        }
        AbstractC166987dD.A1O(A0L, textView2, A00);
    }

    private final void setBodyTextMoveMethod(MovementMethod movementMethod) {
        if (movementMethod != null) {
            this.A02.setMovementMethod(movementMethod);
        }
    }

    public static /* synthetic */ void setIconInternal$default(IgdsBulletCell igdsBulletCell, int i, boolean z, int i2, Object obj) {
        if (i != 0) {
            igdsBulletCell.A01.setImageResource(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r3.getPaddingRight() != 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setExcludeHorizontalPadding(boolean r5) {
        /*
            r4 = this;
            android.view.ViewGroup r3 = r4.A04
            int r0 = r3.getPaddingLeft()
            r2 = 0
            if (r0 != 0) goto L10
            int r1 = r3.getPaddingRight()
            r0 = 0
            if (r1 == 0) goto L11
        L10:
            r0 = 1
        L11:
            if (r5 == 0) goto L19
            if (r0 == 0) goto L18
        L15:
            X.AbstractC13880nE.A0i(r3, r2, r2)
        L18:
            return
        L19:
            if (r0 != 0) goto L18
            android.content.Context r0 = r4.getContext()
            int r2 = X.AbstractC167017dG.A0C(r0)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.bulletcell.IgdsBulletCell.setExcludeHorizontalPadding(boolean):void");
    }

    public final void setIconColor(int i) {
        AbstractC31173DnH.A11(getContext(), this.A01, i);
    }

    public final void setMovementMethod(MovementMethod movementMethod, MovementMethod movementMethod2) {
        this.A03.setMovementMethod(movementMethod);
        this.A02.setMovementMethod(movementMethod2);
    }

    public final void setTextColor(int i) {
        AbstractC166987dD.A1O(getContext(), this.A02, i);
    }

    public final EnumC33418Epp getSurfaceType() {
        return this.A00;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsBulletCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public final void setIcon(int i) {
        if (i != 0) {
            this.A01.setImageResource(i);
        }
    }

    public final void setText(CharSequence charSequence, CharSequence charSequence2) {
        A00(this, charSequence, charSequence2);
    }

    public /* synthetic */ IgdsBulletCell(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsBulletCell(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
