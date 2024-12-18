package com.instagram.urlhandlers.genericsurvey;

import X.AbstractC08820cl;
import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31177DnL;
import X.AbstractC35178FfV;
import X.AbstractC54852fj;
import X.C0f9;
import X.InterfaceC11380iw;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.genericsurvey.fragment.GenericSurveyFragment;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class GenericSurveyUrlHandlerActivity extends IgFragmentActivity implements InterfaceC11380iw {
    public AbstractC18680vv A00;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "generic_survey_handler_action";
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        int A00 = C0f9.A00(-1793311573);
        super.onCreate(bundle);
        AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
        this.A00 = A0F;
        if (A0F == null) {
            finish();
            i = 640759073;
        } else {
            Intent intent = getIntent();
            Bundle A08 = AbstractC31172DnG.A08(intent);
            if (A08 == null) {
                finish();
                i = 1151253336;
            } else {
                if (this.A00 instanceof UserSession) {
                    String stringExtra = intent.getStringExtra(AbstractC111324zv.A00(385));
                    if (stringExtra == null) {
                        finish();
                        i = -2028361865;
                    } else {
                        String A0a = AbstractC31171DnF.A0a(A08);
                        if (A0a != null) {
                            Uri A03 = AbstractC08820cl.A03(A0a);
                            if (!TextUtils.isEmpty(A0a)) {
                                JSONObject A0q = AbstractC31171DnF.A0q();
                                try {
                                    Iterator<String> it = A03.getQueryParameterNames().iterator();
                                    while (it.hasNext()) {
                                        String A1B = AbstractC166987dD.A1B(it);
                                        A0q.put(A1B, A03.getQueryParameter(A1B));
                                    }
                                    str = A0q.toString();
                                    GenericSurveyFragment A02 = IgFragmentFactoryImpl.A00().A02(stringExtra, str);
                                    Object A002 = AbstractC54852fj.A00();
                                    A002.getClass();
                                    AbstractC31177DnL.A15(A02, (FragmentActivity) A002, this.A00);
                                    finish();
                                } catch (JSONException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                        finish();
                        str = null;
                        GenericSurveyFragment A022 = IgFragmentFactoryImpl.A00().A02(stringExtra, str);
                        Object A0022 = AbstractC54852fj.A00();
                        A0022.getClass();
                        AbstractC31177DnL.A15(A022, (FragmentActivity) A0022, this.A00);
                        finish();
                    }
                } else {
                    AbstractC35178FfV.A00().A00(this, A08, this.A00);
                }
                i = -1636532472;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
