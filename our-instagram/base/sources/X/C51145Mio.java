package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.List;

/* renamed from: X.Mio, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51145Mio extends C2UU {
    public OH0 A00;
    public boolean A01;
    public final List A02 = AbstractC166987dD.A1E();

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        String str;
        ImageView imageView;
        CharSequence charSequence;
        C14360o3.A0B(c3oo, 0);
        View view = c3oo.itemView;
        Context context = view.getContext();
        int itemViewType = getItemViewType(i);
        int i2 = 0;
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                ColorStateList colorStateList = null;
                if (itemViewType != 2) {
                    List list = this.A02;
                    if (itemViewType != 3) {
                        Object obj = list.get(i);
                        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.ui.menu.IgdsListCellItem");
                        C54737OFo c54737OFo = (C54737OFo) obj;
                        IgdsListCell igdsListCell = ((C51247MkW) c3oo).A00;
                        igdsListCell.A0I(c54737OFo.A0E);
                        String str2 = c54737OFo.A0D;
                        if (str2 instanceof CharSequence) {
                            igdsListCell.A0H(str2);
                        }
                        Integer num = c54737OFo.A05;
                        if (num != null) {
                            igdsListCell.A05(num.intValue());
                        }
                        Integer num2 = c54737OFo.A0B;
                        Integer num3 = c54737OFo.A0A;
                        if (num2 != null && num3 != null) {
                            igdsListCell.A08(num2.intValue(), num3.intValue());
                        }
                        Integer num4 = c54737OFo.A09;
                        Integer num5 = c54737OFo.A07;
                        if (num4 != null && num5 != null) {
                            igdsListCell.A07(num4.intValue(), num5.intValue());
                        }
                        String str3 = c54737OFo.A0C;
                        if (str3 != null && str3.length() != 0) {
                            igdsListCell.A0K(str3, false);
                            igdsListCell.setTextCellType(EnumC53237Nga.A04);
                        }
                        if (c54737OFo.A01 != null) {
                            AbstractC56952jT.A01(igdsListCell);
                            igdsListCell.A0C(new OkD(i, 5, c54737OFo, this));
                        }
                        View.OnClickListener onClickListener = c54737OFo.A00;
                        if (onClickListener != null) {
                            igdsListCell.setTextCellType(EnumC53237Nga.A05);
                            igdsListCell.A00 = onClickListener;
                            return;
                        }
                        return;
                    }
                    Object obj2 = list.get(i);
                    C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.ui.menu.ArrowItem");
                    C35200Ffs c35200Ffs = (C35200Ffs) obj2;
                    C51280Ml3 c51280Ml3 = (C51280Ml3) c3oo;
                    View A06 = AbstractC31171DnF.A06(c51280Ml3);
                    int i3 = c35200Ffs.A06;
                    TextView textView = c51280Ml3.A01;
                    if (i3 != 0) {
                        charSequence = context.getString(i3);
                    } else {
                        charSequence = c35200Ffs.A09;
                    }
                    textView.setText(charSequence);
                    textView.setTextColor(textView.getTextColors().withAlpha((int) (c35200Ffs.A00 * 255.0f)));
                    if (this.A00 != null) {
                        AbstractC56952jT.A01(textView);
                        ViewOnClickListenerC55458OkC.A01(A06, this, i, 4);
                    }
                    int i4 = c35200Ffs.A05;
                    if (i4 != -1 && i4 != 0) {
                        imageView = c51280Ml3.A00;
                        imageView.setImageResource(i4);
                        AbstractC31173DnH.A11(context, imageView, AbstractC53242c7.A08(context));
                        imageView.setAlpha(c35200Ffs.A00);
                        imageView.setVisibility(0);
                        return;
                    }
                    imageView = c51280Ml3.A00;
                    imageView.setVisibility(8);
                    return;
                }
                Object obj3 = this.A02.get(i);
                C14360o3.A0C(obj3, "null cannot be cast to non-null type com.instagram.ui.menu.ButtonItem");
                C50676MYu c50676MYu = (C50676MYu) obj3;
                C51298MlL c51298MlL = (C51298MlL) c3oo;
                View A062 = AbstractC31171DnF.A06(c51298MlL);
                int i5 = c50676MYu.A02;
                TextView textView2 = c51298MlL.A02;
                if (i5 != 0) {
                    str = context.getString(i5);
                } else {
                    str = c50676MYu.A04;
                }
                textView2.setText(str);
                boolean z = c50676MYu.A06;
                View view2 = c51298MlL.A00;
                if (z) {
                    view2.setVisibility(0);
                } else {
                    view2.setVisibility(8);
                }
                int i6 = c50676MYu.A09;
                if (i6 != 0) {
                    c51298MlL.itemView.setId(i6);
                }
                int i7 = c50676MYu.A08;
                int color = context.getColor(i7);
                ColorStateList A02 = C02G.A02(context, i7);
                if (A02 != null) {
                    colorStateList = A02.withAlpha((int) (c50676MYu.A07 * 255.0f));
                }
                textView2.setTextColor(colorStateList);
                imageView = c51298MlL.A01;
                imageView.setColorFilter(color);
                imageView.setAlpha(c50676MYu.A07);
                if (this.A00 != null) {
                    AbstractC56952jT.A01(textView2);
                    if (c50676MYu.A05) {
                        ViewOnClickListenerC55458OkC.A01(A062, this, i, 3);
                    }
                }
                int i8 = c50676MYu.A00;
                if (i8 != -1) {
                    imageView.setImageResource(i8);
                    imageView.setVisibility(0);
                    return;
                }
                imageView.setVisibility(8);
                return;
            }
            AbstractC31171DnF.A06(c3oo).setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
            return;
        }
        TextView textView3 = (TextView) view;
        Object obj4 = this.A02.get(i);
        C14360o3.A0C(obj4, "null cannot be cast to non-null type com.instagram.ui.menu.ButtonItem");
        C50676MYu c50676MYu2 = (C50676MYu) obj4;
        int i9 = c50676MYu2.A02;
        if (i9 != 0) {
            textView3.setText(i9);
        } else {
            textView3.setText(c50676MYu2.A04);
        }
        int i10 = c50676MYu2.A09;
        if (i10 != 0) {
            textView3.setId(i10);
        }
        AbstractC166987dD.A1O(context, textView3, c50676MYu2.A08);
        if (i == getItemCount() - 1) {
            i2 = AbstractC167017dG.A0F(context);
        }
        AbstractC13880nE.A0U(textView3, i2);
        if (this.A00 == null) {
            return;
        }
        AbstractC56952jT.A01(textView3);
        ViewOnClickListenerC55458OkC.A01(textView3, this, i, 2);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater A0P;
        int i2;
        C14360o3.A0B(viewGroup, 0);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return new C51281Ml4(AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.action_sheet_row_with_notes, viewGroup, false));
                            }
                        } else {
                            return new C51247MkW(AbstractC31174DnI.A0Z(AbstractC166997dE.A0L(viewGroup)));
                        }
                    } else {
                        return new C51280Ml3(AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.row_arrow_item, viewGroup, false));
                    }
                } else {
                    LayoutInflater A0P2 = AbstractC25228BEl.A0P(viewGroup);
                    boolean z = this.A01;
                    int i3 = R.layout.action_sheet_row_with_icon;
                    if (z) {
                        i3 = R.layout.action_sheet_row_with_icon_v2;
                    }
                    return new C51298MlL(A0P2.inflate(i3, viewGroup, false));
                }
            } else {
                A0P = AbstractC25228BEl.A0P(viewGroup);
                i2 = R.layout.bottom_sheet_divider;
                View inflate = A0P.inflate(i2, viewGroup, false);
                int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A0B(inflate, 1);
                return new C3OO(inflate);
            }
        }
        A0P = AbstractC25228BEl.A0P(viewGroup);
        i2 = R.layout.action_sheet_row;
        View inflate2 = A0P.inflate(i2, viewGroup, false);
        int i42 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0B(inflate2, 1);
        return new C3OO(inflate2);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-236603859);
        int size = this.A02.size();
        C0f9.A0A(-2022765063, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int A03 = C0f9.A03(-578241912);
        Object obj = this.A02.get(i);
        if (obj instanceof C35119FeM) {
            i2 = 1;
        } else if (obj instanceof C35200Ffs) {
            i2 = 3;
        } else if (obj instanceof C54737OFo) {
            i2 = 4;
        } else {
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.ui.menu.ButtonItem");
            i2 = 0;
            if (((C50676MYu) obj).A00 != -1) {
                i2 = 2;
            }
        }
        C0f9.A0A(1718189415, A03);
        return i2;
    }
}
