package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.igds.components.gradient.IGGradientView;
import java.util.List;

/* renamed from: X.ISs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41365ISs {
    public static final View A00(Context context, ViewGroup viewGroup) {
        C14360o3.A0B(context, 0);
        View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(context), viewGroup, R.layout.merchant_hscroll, false);
        C38503GwO c38503GwO = new C38503GwO(A0D);
        A0D.setTag(c38503GwO);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        linearLayoutManager.A12(true);
        RecyclerView recyclerView = c38503GwO.A04;
        recyclerView.setLayoutManager(linearLayoutManager);
        Resources resources = context.getResources();
        AbstractC37304Gc5.A0z(recyclerView, AbstractC166997dE.A05(resources), resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material));
        AbstractC13880nE.A0Y(recyclerView, AbstractC166997dE.A05(resources));
        return A0D;
    }

    public static final void A01(Context context, View.OnClickListener onClickListener, InterfaceC11380iw interfaceC11380iw, C41047IFq c41047IFq, InterfaceC65002wy interfaceC65002wy, C38503GwO c38503GwO, String str, String str2, List list) {
        AbstractC167027dH.A12(context, c38503GwO, interfaceC11380iw);
        C14360o3.A0B(c41047IFq, 6);
        if (str2 != null) {
            InterfaceC56392iX interfaceC56392iX = c38503GwO.A05;
            int i = 0;
            interfaceC56392iX.setVisibility(0);
            interfaceC56392iX.getView().setBackgroundResource(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_background));
            TextView textView = c38503GwO.A03;
            if (textView != null) {
                if (c38503GwO.A02 != null) {
                    if (c38503GwO.A01 != null) {
                        if (c38503GwO.A00 != null) {
                            textView.setText(str2);
                            TextView textView2 = c38503GwO.A02;
                            if (textView2 != null) {
                                textView2.setVisibility(8);
                            }
                            TextView textView3 = c38503GwO.A01;
                            if (textView3 != null) {
                                textView3.setVisibility(8);
                            }
                            TextView textView4 = c38503GwO.A00;
                            if (textView4 != null) {
                                if (onClickListener == null) {
                                    i = 8;
                                }
                                textView4.setVisibility(i);
                            }
                            if (onClickListener != null) {
                                Drawable drawable = context.getDrawable(R.drawable.instagram_x_pano_outline_12);
                                if (drawable != null) {
                                    AbstractC25231BEo.A0x(context, drawable, AbstractC53242c7.A0B(context));
                                }
                                TextView textView5 = c38503GwO.A00;
                                if (textView5 != null) {
                                    textView5.setText("");
                                    textView5.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                                    C0fQ.A00(onClickListener, textView5);
                                }
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            c38503GwO.A05.setVisibility(8);
        }
        C16930sl c16930sl = C16930sl.A00;
        RecyclerView recyclerView = c38503GwO.A04;
        recyclerView.A0a();
        recyclerView.A14(new C38385GuM(c41047IFq, 9));
        int A0H = AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_background);
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if (abstractC70663Fe != null) {
            abstractC70663Fe.A1P(c41047IFq.A00);
        }
        AbstractC31172DnG.A1B(context, recyclerView, A0H);
        AbstractC13880nE.A0Y(recyclerView, 0);
        C38358Gtu c38358Gtu = (C38358Gtu) recyclerView.A0A;
        if (c38358Gtu == null) {
            C38358Gtu c38358Gtu2 = new C38358Gtu(context, interfaceC11380iw);
            c38358Gtu2.A01 = str;
            C14360o3.A0B(c16930sl, 1);
            List list2 = c38358Gtu2.A05;
            if (AbstractC25225BEi.A1a(list2, list)) {
                list2.clear();
                list2.addAll(list);
                AbstractC31175DnJ.A0x(c38358Gtu2, c16930sl, c38358Gtu2.A04);
            }
            c38358Gtu2.A00 = interfaceC65002wy;
            c38358Gtu2.notifyDataSetChanged();
            recyclerView.setAdapter(c38358Gtu2);
        } else if (AbstractC25225BEi.A1a(c38358Gtu.A05, list)) {
            c38358Gtu.A01 = str;
            C14360o3.A0B(c16930sl, 1);
            List list3 = c38358Gtu.A05;
            if (AbstractC25225BEi.A1a(list3, list)) {
                list3.clear();
                list3.addAll(list);
                AbstractC31175DnJ.A0x(c38358Gtu, c16930sl, c38358Gtu.A04);
            }
            c38358Gtu.A00 = interfaceC65002wy;
            c38358Gtu.notifyDataSetChanged();
            recyclerView.A0n(0);
        } else {
            c38358Gtu.notifyDataSetChanged();
        }
        int A09 = AbstractC167007dF.A09(context, R.attr.igds_color_secondary_background);
        IGGradientView iGGradientView = c38503GwO.A07;
        iGGradientView.setVisibility(0);
        iGGradientView.setBackground(BOV.A00(GradientDrawable.Orientation.BOTTOM_TOP, A09));
        IGGradientView iGGradientView2 = c38503GwO.A06;
        iGGradientView2.setVisibility(0);
        iGGradientView2.setBackground(BOV.A00(GradientDrawable.Orientation.TOP_BOTTOM, A09));
    }
}
