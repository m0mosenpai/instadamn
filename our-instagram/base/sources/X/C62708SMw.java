package X;

import android.content.Context;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.instagram.igds.components.form.IgFormField;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.SMw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62708SMw {
    public String A00;
    public final IgFormField A01;
    public final IgFormField A02;
    public final IgFormField A03;
    public final IgFormField A04;
    public final IgFormField A05;
    public final IgFormField A06;
    public final IgFormField A07;
    public final IgFormField A08;
    public final IgFormField A09;

    public C62708SMw(Context context, View view) {
        this.A07 = (IgFormField) AbstractC166997dE.A0R(view, R.id.given_name);
        this.A06 = (IgFormField) AbstractC166997dE.A0R(view, R.id.family_name);
        this.A03 = (IgFormField) AbstractC166997dE.A0R(view, R.id.address_line_1);
        this.A04 = (IgFormField) AbstractC166997dE.A0R(view, R.id.address_line_2);
        this.A01 = (IgFormField) AbstractC166997dE.A0R(view, R.id.address_level_1);
        this.A02 = (IgFormField) AbstractC166997dE.A0R(view, R.id.address_level_2);
        this.A08 = (IgFormField) AbstractC166997dE.A0R(view, R.id.postal_code);
        this.A05 = (IgFormField) AbstractC166997dE.A0R(view, R.id.email);
        this.A09 = (IgFormField) AbstractC166997dE.A0R(view, R.id.tel);
        IgFormField igFormField = this.A05;
        igFormField.setRuleChecker(new G8L(context));
        this.A07.setInputType(8288);
        this.A06.setInputType(8288);
        Iterator it = AbstractC16960so.A1Q(this.A03, this.A04, this.A01, this.A02).iterator();
        while (it.hasNext()) {
            ((IgFormField) it.next()).setInputType(8304);
        }
        this.A08.setInputType(112);
        igFormField.setInputType(33);
        this.A09.setInputType(3);
    }

    public final AutofillData A00() {
        HashMap A1G = AbstractC166987dD.A1G();
        String str = this.A00;
        if (str != null) {
            A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        AbstractC62245S3q.A00(this.A07, "given-name", A1G);
        AbstractC62245S3q.A00(this.A06, "family-name", A1G);
        AbstractC62245S3q.A00(this.A03, "address-line1", A1G);
        AbstractC62245S3q.A00(this.A04, "address-line2", A1G);
        AbstractC62245S3q.A00(this.A01, "address-level1", A1G);
        AbstractC62245S3q.A00(this.A02, "address-level2", A1G);
        AbstractC62245S3q.A00(this.A08, "postal-code", A1G);
        AbstractC62245S3q.A00(this.A05, "email", A1G);
        AbstractC62245S3q.A00(this.A09, "tel", A1G);
        return new AutofillData(A1G);
    }
}
