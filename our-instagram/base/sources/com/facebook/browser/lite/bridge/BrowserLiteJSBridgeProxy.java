package com.facebook.browser.lite.bridge;

import X.C00O;
import X.C14360o3;
import X.C63475SlG;
import X.QF6;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.webview.SystemWebView;

/* loaded from: classes10.dex */
public class BrowserLiteJSBridgeProxy implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(14);
    public Bundle A00;
    public String A01;
    public QF6 A02;
    public String A03;

    public final synchronized Bundle A04() {
        return this.A00;
    }

    public final synchronized QF6 A05() {
        return this.A02;
    }

    public final synchronized String A07() {
        return this.A03;
    }

    public final synchronized void A08(QF6 qf6) {
        this.A02 = qf6;
        if (qf6 != null) {
            this.A03 = qf6.A05();
        }
    }

    public final synchronized void A09(String str) {
        C14360o3.A0B(str, 0);
        this.A03 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        String str = this.A01;
        if (str == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            throw C00O.createAndThrow();
        }
        parcel.writeString(str);
        parcel.writeBundle(this.A00);
    }

    public final String A06() {
        String str = this.A01;
        if (str == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            throw C00O.createAndThrow();
        }
        return str;
    }

    public final Context A03() {
        QF6 A05 = A05();
        if (A05 != null) {
            return ((SystemWebView) A05).A04.getContext();
        }
        return null;
    }
}
