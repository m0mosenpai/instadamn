package X;

import android.content.Context;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.WOw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70267WOw implements ListAdapter {
    public final Context A03;
    public final DataSetObservable A04 = new DataSetObservable();
    public final List A02 = new ArrayList();
    public final List A05 = new ArrayList();
    public final Comparator A01 = C71657Wy8.A00;
    public String A00 = "";

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return true;
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C69143ViY c69143ViY;
        String str;
        C4NM c4nm;
        C14360o3.A0B(viewGroup, 2);
        if (view == null) {
            view = AbstractC31173DnH.A0C(LayoutInflater.from(this.A03), viewGroup, R.layout.quick_promotion_slot_item, false);
            c69143ViY = new C69143ViY(view);
            view.setTag(c69143ViY);
        } else {
            Object tag = view.getTag();
            if (tag != null) {
                c69143ViY = (C69143ViY) tag;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        C69703Vty c69703Vty = (C69703Vty) getItem(i);
        if (c69703Vty != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Map map = c69703Vty.A03;
            Iterator A15 = AbstractC166997dE.A15(c69703Vty.A02);
            int i2 = 0;
            while (A15.hasNext()) {
                Map.Entry entry = (Map.Entry) A15.next();
                EnumC61092qX enumC61092qX = (EnumC61092qX) entry.getKey();
                List<C117035Rm> list = (List) entry.getValue();
                QuickPromotionSurface quickPromotionSurface = enumC61092qX.A00;
                StringBuilder sb = new StringBuilder();
                sb.append("\n");
                String A0X = AbstractC37303Gc4.A0X(quickPromotionSurface.name());
                sb.append(A0X);
                sb.append("\n");
                SpannableString spannableString = new SpannableString(AnonymousClass001.A0g("\n", A0X, "\n"));
                spannableString.setSpan(new CharacterStyle(), 0, sb.length(), 0);
                spannableStringBuilder.append((CharSequence) spannableString);
                if (list != null && !list.isEmpty()) {
                    for (C117035Rm c117035Rm : list) {
                        C117045Rn c117045Rn = c117035Rm.A02;
                        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) "\"");
                        List list2 = c117045Rn.A06;
                        String str2 = "";
                        if (list2 == null || (c4nm = (C4NM) AbstractC001800i.A0J(list2)) == null || (str = c4nm.A09.A00) == null) {
                            str = "";
                        }
                        append.append((CharSequence) str).append((CharSequence) "\" ");
                        Object obj = map.get(c117035Rm.A02.A05);
                        if (obj != null) {
                            C5OL c5ol = (C5OL) obj;
                            String str3 = c5ol.A04;
                            if (str3 != null) {
                                str2 = str3;
                            }
                            if (c5ol.A07 && !c5ol.A05) {
                                spannableStringBuilder.append((CharSequence) " is qualified.\n");
                                if (str2.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) str2);
                                }
                                i2++;
                            } else {
                                spannableStringBuilder.append((CharSequence) "is not qualified: ").append((CharSequence) str2).append((CharSequence) ".\n");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                } else {
                    spannableStringBuilder.append((CharSequence) "No QPs\n");
                }
            }
            c69143ViY.A02.setText(AbstractC68569VVw.A00(c69703Vty));
            TextView textView = c69143ViY.A01;
            String format = String.format("%d qualified promotion(s)", Arrays.copyOf(AbstractC25228BEl.A1Y(i2), 1));
            C14360o3.A07(format);
            textView.setText(format);
            c69143ViY.A00.setText(spannableStringBuilder);
            return view;
        }
        throw new RuntimeException(AnonymousClass001.A0O("Failed to get an item at position ", i));
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        C14360o3.A0B(dataSetObserver, 0);
        this.A04.registerObserver(dataSetObserver);
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        C14360o3.A0B(dataSetObserver, 0);
        this.A04.unregisterObserver(dataSetObserver);
    }

    public static final void A00(C70267WOw c70267WOw) {
        List list = c70267WOw.A05;
        list.clear();
        for (C69703Vty c69703Vty : c70267WOw.A02) {
            if (AbstractC001900j.A0a(AbstractC167007dF.A0h(AbstractC68569VVw.A00(c69703Vty)), c70267WOw.A00, false)) {
                list.add(c69703Vty);
            }
        }
        boolean isEmpty = list.isEmpty();
        DataSetObservable dataSetObservable = c70267WOw.A04;
        if (!isEmpty) {
            dataSetObservable.notifyChanged();
        } else {
            dataSetObservable.notifyInvalidated();
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A05.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        List list = this.A05;
        if (list.size() > i) {
            return list.get(i);
        }
        return null;
    }

    public C70267WOw(Context context) {
        this.A03 = context;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        if (((C69703Vty) getItem(i)) != null) {
            return r0.A00.ordinal();
        }
        return -1L;
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return AbstractC167007dF.A1N(getCount());
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return AbstractC167007dF.A1W(getItem(i));
    }
}
