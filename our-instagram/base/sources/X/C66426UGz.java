package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UGz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66426UGz extends C2UU implements X71 {
    public List A00;
    public List A01;
    public final List A04;
    public final PreferenceGroup A05;
    public final Runnable A03 = new RunnableC71227WqI(this);
    public final Handler A02 = AbstractC167007dF.A0J();

    /* JADX WARN: Type inference failed for: r1v0, types: [X.VK8, java.lang.Object] */
    private void A01(PreferenceGroup preferenceGroup, List list) {
        List list2;
        synchronized (preferenceGroup) {
            list2 = preferenceGroup.A07;
            Collections.sort(list2);
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) list2.get(i);
            list.add(preference);
            ?? obj = new Object();
            obj.A02 = MSY.A0h(preference);
            obj.A00 = preference.A01;
            obj.A01 = preference.A03;
            AbstractC43594JPz.A1Q(obj, this.A04);
            if (preference instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preference;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    A01(preferenceGroup2, list);
                }
            }
            preference.A07 = this;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.UG3, java.lang.Object, androidx.preference.Preference] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.ArrayList A00(androidx.preference.PreferenceGroup r13) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66426UGz.A00(androidx.preference.PreferenceGroup):java.util.ArrayList");
    }

    public final Preference A02(int i) {
        if (i >= 0 && i < getItemCount()) {
            return (Preference) this.A00.get(i);
        }
        return null;
    }

    public final void A03() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).A07 = null;
        }
        ArrayList A0q = AbstractC25230BEn.A0q(this.A01);
        this.A01 = A0q;
        PreferenceGroup preferenceGroup = this.A05;
        A01(preferenceGroup, A0q);
        this.A00 = A00(preferenceGroup);
        notifyDataSetChanged();
        Iterator it2 = this.A01.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        ColorStateList colorStateList;
        C66482UJh c66482UJh = (C66482UJh) c3oo;
        Preference A02 = A02(i);
        Drawable background = c66482UJh.itemView.getBackground();
        Drawable drawable = c66482UJh.A03;
        if (background != drawable) {
            c66482UJh.itemView.setBackground(drawable);
        }
        TextView textView = (TextView) c66482UJh.A00(R.id.title);
        if (textView != null && (colorStateList = c66482UJh.A00) != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        A02.A0D(c66482UJh);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        VK8 vk8 = (VK8) this.A04.get(i);
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, AbstractC68645VZd.A00);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = C71x.A00(context, R.drawable.list_selector_background);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(vk8.A00, viewGroup, false);
        if (inflate.getBackground() == null) {
            inflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = vk8.A01;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new C66482UJh(inflate);
    }

    public C66426UGz(PreferenceGroup preferenceGroup) {
        this.A05 = preferenceGroup;
        ((Preference) preferenceGroup).A07 = this;
        this.A01 = new ArrayList();
        this.A00 = new ArrayList();
        this.A04 = new ArrayList();
        setHasStableIds(true);
        A03();
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(232106194);
        int size = this.A00.size();
        C0f9.A0A(-2117005126, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        long j;
        int i2;
        int A03 = C0f9.A03(-2040957148);
        if (!hasStableIds()) {
            j = -1;
            i2 = 33051979;
        } else {
            Preference A02 = A02(i);
            if (A02 instanceof UG3) {
                j = ((UG3) A02).A00;
            } else {
                j = A02.A04;
            }
            i2 = -1590263008;
        }
        C0f9.A0A(i2, A03);
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.VK8, java.lang.Object] */
    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int A03 = C0f9.A03(-118823241);
        Preference A02 = A02(i);
        ?? obj = new Object();
        obj.A02 = MSY.A0h(A02);
        obj.A00 = A02.A01;
        obj.A01 = A02.A03;
        List list = this.A04;
        int indexOf = list.indexOf(obj);
        if (indexOf != -1) {
            i2 = -734597709;
        } else {
            indexOf = list.size();
            list.add(obj);
            i2 = -962435373;
        }
        C0f9.A0A(i2, A03);
        return indexOf;
    }
}
