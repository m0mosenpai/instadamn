package com.instagram.newsfeed.ui;

import X.AbstractC06930Yk;
import X.AbstractC08820cl;
import X.AbstractC09440dt;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25226BEj;
import X.AbstractC25227BEk;
import X.AbstractC25235BEs;
import X.AbstractC68612VXn;
import X.AnonymousClass001;
import X.C00O;
import X.C0T6;
import X.C14360o3;
import X.C1QF;
import X.C26000Beo;
import X.C3R9;
import X.C57518Pfs;
import X.EnumC53242Ngf;
import X.InterfaceC08100bW;
import X.InterfaceC09390do;
import X.MSZ;
import X.MUO;
import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes9.dex */
public final class InlineLinkUrn extends C0T6 {
    public final Uri A00;
    public final String A01;
    public final String A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public static final Companion Companion = new Object();
    public static final InterfaceC08100bW A05 = new C1QF("IgSecureUriParser").A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InlineLinkUrn) {
                InlineLinkUrn inlineLinkUrn = (InlineLinkUrn) obj;
                if (!C14360o3.A0K(this.A01, inlineLinkUrn.A01) || !C14360o3.A0K(this.A02, inlineLinkUrn.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    /* loaded from: classes5.dex */
    public final class Companion {
        public static final InlineLinkUrn A00(C26000Beo c26000Beo, String str) {
            C14360o3.A0B(c26000Beo, 0);
            String A0w = AbstractC25227BEk.A0w(str, c26000Beo.A01, c26000Beo.A00);
            String str2 = ((EnumC53242Ngf) c26000Beo.A06.getValue()).A00;
            LinkedHashMap A03 = AbstractC06930Yk.A03((Map) c26000Beo.A04.getValue());
            A03.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c26000Beo.A02);
            Uri.Builder builder = new Uri.Builder();
            builder.authority(str2);
            Iterator A14 = AbstractC166997dE.A14(A03);
            while (A14.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                builder.appendQueryParameter((String) A1K.getKey(), (String) A1K.getValue());
            }
            return new InlineLinkUrn(A0w, AbstractC166987dD.A19(builder.build()));
        }

        public final C3R9 serializer() {
            return MUO.A00;
        }
    }

    public /* synthetic */ InlineLinkUrn(String str, String str2, int i) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(MUO.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A01 = str;
        this.A02 = str2;
        this.A00 = AbstractC08820cl.A01(A05, str2);
        this.A04 = AbstractC25235BEs.A0t(this, 19);
        this.A03 = AbstractC25235BEs.A0t(this, 20);
    }

    public final String A00(String str) {
        return (String) MSZ.A0l(str, this.A04);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166987dD.A0J(this.A01));
    }

    public final String toString() {
        return AnonymousClass001.A11("InlineLinkUrn(text='", this.A01, "', url='", this.A02, "')");
    }

    public InlineLinkUrn(String str, String str2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = AbstractC08820cl.A01(A05, str2);
        this.A04 = AbstractC09440dt.A01(new C57518Pfs(this, 19));
        this.A03 = AbstractC09440dt.A01(new C57518Pfs(this, 20));
    }
}
