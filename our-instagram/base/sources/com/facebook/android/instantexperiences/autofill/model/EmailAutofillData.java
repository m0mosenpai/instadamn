package com.facebook.android.instantexperiences.autofill.model;

import X.C14360o3;
import X.C58406Puk;
import X.Py5;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes10.dex */
public final class EmailAutofillData extends BrowserExtensionsAutofillData {
    public static final Set A00 = new C58406Puk(1);
    public static final Parcelable.Creator CREATOR = Py5.A00(92);

    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData, com.facebook.android.instantexperiences.autofill.model.FbAutofillData, java.lang.Object] */
    @Override // com.facebook.android.instantexperiences.autofill.model.FbAutofillData
    public final /* bridge */ /* synthetic */ FbAutofillData AIA(Set set) {
        C14360o3.A0B(set, 0);
        HashMap A01 = A01(set);
        ?? obj = new Object();
        obj.A00 = A01;
        return obj;
    }
}
