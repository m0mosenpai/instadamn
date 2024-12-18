package com.instagram.debug.devoptions.api;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.C1Q2;
import X.C34965Fap;
import X.C34966Faq;
import X.C34969Fat;
import X.C35246Fgf;
import X.C35473Fl9;
import X.C36731GHa;
import X.C50676MYu;
import X.EPV;
import X.FMR;
import X.FMU;
import X.GHY;
import X.InterfaceC11380iw;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* loaded from: classes6.dex */
public class DevOptionsPreferenceAdapter extends EPV implements Filterable {
    public final Context mContext;
    public final Filter mFilter;
    public final List mUnfilteredItems;

    /* JADX INFO: Access modifiers changed from: private */
    public CharSequence getItemTitle(Object obj) {
        if (obj instanceof C35246Fgf) {
            return ((C35246Fgf) obj).A05;
        }
        if (obj instanceof C36731GHa) {
            C36731GHa c36731GHa = (C36731GHa) obj;
            CharSequence charSequence = c36731GHa.A0B;
            if (charSequence == null) {
                return this.mContext.getString(c36731GHa.A04);
            }
            return charSequence;
        }
        if (obj instanceof FMR) {
            return this.mContext.getString(((FMR) obj).A02);
        }
        if (obj instanceof C50676MYu) {
            return this.mContext.getString(((C50676MYu) obj).A02);
        }
        if (obj instanceof C35473Fl9) {
            return ((C35473Fl9) obj).A03;
        }
        if (obj instanceof C34969Fat) {
            C34969Fat c34969Fat = (C34969Fat) obj;
            CharSequence charSequence2 = c34969Fat.A07;
            if (charSequence2 == null) {
                return this.mContext.getString(c34969Fat.A02);
            }
            return charSequence2;
        }
        if (obj instanceof C34966Faq) {
            C34966Faq c34966Faq = (C34966Faq) obj;
            CharSequence charSequence3 = c34966Faq.A04;
            if (charSequence3 == null) {
                return this.mContext.getString(c34966Faq.A01);
            }
            return charSequence3;
        }
        if (obj instanceof GHY) {
            GHY ghy = (GHY) obj;
            CharSequence charSequence4 = ghy.A08;
            if (charSequence4 == null) {
                return this.mContext.getString(ghy.A04);
            }
            return charSequence4;
        }
        if (obj instanceof C34965Fap) {
            return ((C34965Fap) obj).A07;
        }
        return null;
    }

    public void setTypeaheadHeaderModel(FMU fmu) {
        this.mUnfilteredItems.set(0, fmu);
    }

    public void setUnfilteredItems(List list) {
        if (list == null) {
            list = AbstractC166987dD.A1E();
        }
        this.mUnfilteredItems.clear();
        this.mUnfilteredItems.addAll(list);
    }

    public DevOptionsPreferenceAdapter(Context context, AbstractC12990ll abstractC12990ll, InterfaceC11380iw interfaceC11380iw) {
        super(context, abstractC12990ll, interfaceC11380iw);
        this.mUnfilteredItems = AbstractC166987dD.A1E();
        this.mFilter = new Filter() { // from class: com.instagram.debug.devoptions.api.DevOptionsPreferenceAdapter.1
            @Override // android.widget.Filter
            public Filter.FilterResults performFiltering(CharSequence charSequence) {
                int size;
                Filter.FilterResults filterResults = new Filter.FilterResults();
                if (TextUtils.isEmpty(charSequence)) {
                    List list = DevOptionsPreferenceAdapter.this.mUnfilteredItems;
                    filterResults.values = list;
                    size = list.size();
                } else {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    HashSet A1H = AbstractC166987dD.A1H();
                    for (Object obj : DevOptionsPreferenceAdapter.this.mUnfilteredItems) {
                        if (obj instanceof FMU) {
                            A1E.add(obj);
                        } else if (DevOptionsPreferenceAdapter.this.matches(obj, (String) charSequence) && !A1H.contains(DevOptionsPreferenceAdapter.this.getItemTitle(obj))) {
                            A1E.add(obj);
                            A1H.add(DevOptionsPreferenceAdapter.this.getItemTitle(obj));
                        }
                    }
                    filterResults.values = A1E;
                    size = A1E.size();
                }
                filterResults.count = size;
                return filterResults;
            }

            @Override // android.widget.Filter
            public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                DevOptionsPreferenceAdapter.this.setItems((Collection) filterResults.values);
            }
        };
        this.mContext = context;
    }

    private String getTitleInitialsLowerCase(String str) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        for (String str2 : str.toLowerCase(C1Q2.A02()).split(" ")) {
            if (!TextUtils.isEmpty(str2)) {
                int codePointAt = str2.codePointAt(0);
                if (Character.isLetter(codePointAt)) {
                    A1C.appendCodePoint(codePointAt);
                }
            }
        }
        return A1C.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean matches(Object obj, String str) {
        String str2 = (String) getItemTitle(obj);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        Locale A02 = C1Q2.A02();
        String lowerCase = str.toLowerCase(A02);
        if (!str2.toLowerCase(A02).contains(lowerCase) && !getTitleInitialsLowerCase(str2).startsWith(lowerCase)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.mFilter;
    }
}
