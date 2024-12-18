package androidx.appcompat.view.menu;

import X.AbstractC167007dF;
import X.AbstractC25228BEl;
import X.AbstractC31172DnG;
import X.AbstractC53402cO;
import X.C0f9;
import X.C53122bu;
import X.InterfaceC71934XBj;
import X.WQJ;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC71934XBj, AbsListView.SelectionBoundsAdjuster {
    public CheckBox A00;
    public ImageView A01;
    public LinearLayout A02;
    public RadioButton A03;
    public TextView A04;
    public WQJ A05;
    public int A06;
    public Context A07;
    public Drawable A08;
    public Drawable A09;
    public LayoutInflater A0A;
    public ImageView A0B;
    public ImageView A0C;
    public TextView A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;

    public void setIcon(Drawable drawable) {
        boolean z = true;
        if (!this.A0E) {
            z = false;
            if (!this.A0G) {
                return;
            }
        }
        if (this.A01 == null) {
            if (drawable == null && !this.A0G) {
                return;
            }
            ImageView imageView = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
            this.A01 = imageView;
            LinearLayout linearLayout = this.A02;
            if (linearLayout != null) {
                linearLayout.addView(imageView, 0);
            } else {
                addView(imageView, 0);
            }
        }
        if (drawable == null && !this.A0G) {
            this.A01.setVisibility(8);
            return;
        }
        ImageView imageView2 = this.A01;
        if (!z) {
            drawable = null;
        }
        imageView2.setImageDrawable(drawable);
        if (this.A01.getVisibility() == 0) {
            return;
        }
        this.A01.setVisibility(0);
    }

    private LayoutInflater getInflater() {
        LayoutInflater layoutInflater = this.A0A;
        if (layoutInflater == null) {
            LayoutInflater A0P = AbstractC25228BEl.A0P(this);
            this.A0A = A0P;
            return A0P;
        }
        return layoutInflater;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.A0C;
        if (imageView != null) {
            imageView.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    @Override // X.InterfaceC71934XBj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void COF(X.WQJ r10, int r11) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.COF(X.WQJ, int):void");
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.A0B;
        if (imageView != null && imageView.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A0B.getLayoutParams();
            rect.top += this.A0B.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
    }

    @Override // X.InterfaceC71934XBj
    public WQJ getItemData() {
        return this.A05;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.A01 != null && this.A0G) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = this.A01.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        CompoundButton compoundButton3;
        if (!z && this.A03 == null && this.A00 == null) {
            return;
        }
        if ((this.A05.A02 & 4) != 0) {
            if (this.A03 == null) {
                RadioButton radioButton = (RadioButton) AbstractC31172DnG.A0A(getInflater(), this, R.layout.abc_list_menu_item_radio);
                this.A03 = radioButton;
                LinearLayout linearLayout = this.A02;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.A03;
            compoundButton3 = this.A00;
            compoundButton2 = compoundButton3;
        } else {
            if (this.A00 == null) {
                CheckBox checkBox = (CheckBox) AbstractC31172DnG.A0A(getInflater(), this, R.layout.abc_list_menu_item_checkbox);
                this.A00 = checkBox;
                LinearLayout linearLayout2 = this.A02;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.A00;
            compoundButton2 = compoundButton;
            compoundButton3 = this.A03;
        }
        if (z) {
            compoundButton.setChecked(this.A05.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton3 == null || compoundButton3.getVisibility() == 8) {
                return;
            }
            compoundButton3.setVisibility(8);
            return;
        }
        if (compoundButton2 != null) {
            compoundButton2.setVisibility(8);
        }
        RadioButton radioButton2 = this.A03;
        if (radioButton2 == null) {
            return;
        }
        radioButton2.setVisibility(8);
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.A05.A02 & 4) != 0) {
            if (this.A03 == null) {
                RadioButton radioButton = (RadioButton) AbstractC31172DnG.A0A(getInflater(), this, R.layout.abc_list_menu_item_radio);
                this.A03 = radioButton;
                LinearLayout linearLayout = this.A02;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.A03;
        } else {
            if (this.A00 == null) {
                CheckBox checkBox = (CheckBox) AbstractC31172DnG.A0A(getInflater(), this, R.layout.abc_list_menu_item_checkbox);
                this.A00 = checkBox;
                LinearLayout linearLayout2 = this.A02;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.A00;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.A0E = z;
        this.A0G = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0009, code lost:
    
        if (r3 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setGroupDividerEnabled(boolean r3) {
        /*
            r2 = this;
            android.widget.ImageView r1 = r2.A0B
            if (r1 == 0) goto L10
            boolean r0 = r2.A0F
            if (r0 != 0) goto Lb
            r0 = 0
            if (r3 != 0) goto Ld
        Lb:
            r0 = 8
        Ld:
            r1.setVisibility(r0)
        L10:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.setGroupDividerEnabled(boolean):void");
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        TextView textView2 = this.A0D;
        if (charSequence != null) {
            textView2.setText(charSequence);
            if (this.A0D.getVisibility() != 0) {
                textView = this.A0D;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (textView2.getVisibility() == 8) {
                return;
            } else {
                textView = this.A0D;
            }
        }
        textView.setVisibility(i);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C53122bu A00 = C53122bu.A00(getContext(), attributeSet, AbstractC53402cO.A0H, i, 0);
        this.A08 = A00.A02(5);
        TypedArray typedArray = A00.A02;
        this.A06 = typedArray.getResourceId(1, -1);
        this.A0G = typedArray.getBoolean(7, false);
        this.A07 = context;
        this.A09 = A00.A02(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.A0F = obtainStyledAttributes.hasValue(0);
        typedArray.recycle();
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        int A06 = C0f9.A06(-955915171);
        super.onFinishInflate();
        setBackground(this.A08);
        TextView textView = (TextView) findViewById(R.id.title);
        this.A0D = textView;
        int i = this.A06;
        if (i != -1) {
            textView.setTextAppearance(this.A07, i);
        }
        this.A04 = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.A0C = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.A09);
        }
        this.A0B = (ImageView) findViewById(R.id.group_divider);
        this.A02 = (LinearLayout) findViewById(R.id.content);
        C0f9.A0D(-1280611747, A06);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }
}
