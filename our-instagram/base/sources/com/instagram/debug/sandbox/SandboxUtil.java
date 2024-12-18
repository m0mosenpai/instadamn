package com.instagram.debug.sandbox;

import X.AbstractC001900j;
import X.AbstractC11400iy;
import X.AbstractC12990ll;
import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC31171DnF;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31178DnM;
import X.AbstractC31572Dty;
import X.AnonymousClass001;
import X.C0YR;
import X.C14360o3;
import X.C17280tP;
import X.C1HO;
import X.C26661Qv;
import X.C2d6;
import X.C69487VoA;
import X.C69797Vvh;
import X.C9GR;
import X.InterfaceC16530ry;
import X.MSX;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.R;
import com.instagram.debug.sandbox.L;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class SandboxUtil {
    public static final SandboxUtil INSTANCE = new Object();

    public static final Dialog getSandboxDialog(final Context context, final AbstractC12990ll abstractC12990ll, List list, DialogInterface.OnDismissListener onDismissListener) {
        AbstractC167007dF.A1K(context, abstractC12990ll);
        final C17280tP A00 = C17280tP.A4E.A00();
        final ViewGroup viewGroup = (ViewGroup) AbstractC31175DnJ.A07(LayoutInflater.from(context), null, R.layout.layout_dev_host_options, false);
        SandboxUtil sandboxUtil = INSTANCE;
        SearchEditText searchEditText = (SearchEditText) AbstractC166987dD.A0c(viewGroup, R.id.dev_server);
        sandboxUtil.setup(searchEditText);
        if (A00.A0g()) {
            searchEditText.setText(A00.A05());
        }
        SearchEditText searchEditText2 = (SearchEditText) AbstractC166987dD.A0c(viewGroup, R.id.dev_mqtt_server);
        sandboxUtil.setup(searchEditText2);
        InterfaceC16530ry interfaceC16530ry = A00.A1w;
        C0YR[] c0yrArr = C17280tP.A4G;
        if (AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, 53)) {
            searchEditText2.setText(MSX.A0j(A00, A00.A2B, c0yrArr, 54));
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                viewGroup.addView((View) it.next());
            }
        }
        C69797Vvh c69797Vvh = new C69797Vvh(context);
        c69797Vvh.A02(2131957747);
        c69797Vvh.A07(viewGroup);
        C69487VoA c69487VoA = c69797Vvh.A01;
        c69797Vvh.A04(new DialogInterface.OnClickListener() { // from class: com.instagram.debug.sandbox.SandboxUtil$getSandboxDialog$builder$1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SandboxUtil sandboxUtil2 = SandboxUtil.INSTANCE;
                sandboxUtil2.processDevServerChange(viewGroup, A00, abstractC12990ll);
                sandboxUtil2.processMqttChange(viewGroup, A00);
                AbstractC13880nE.A0O(viewGroup);
                C9GR.A09(context, AbstractC31174DnI.A0t(context, C1HO.A00(), RealtimeClientManager.getLatestMqttHost(C26661Qv.A00(abstractC12990ll)), 2131957771));
                dialogInterface.dismiss();
            }
        }, 2131961124);
        if (onDismissListener != null) {
            c69487VoA.A05 = onDismissListener;
        }
        return c69797Vvh.A00();
    }

    private final SearchEditText setup(SearchEditText searchEditText) {
        searchEditText.setSearchIconEnabled(false);
        searchEditText.setClearButtonEnabled(true);
        AbstractC31572Dty.A01(searchEditText);
        return searchEditText;
    }

    public static /* synthetic */ Dialog getSandboxDialog$default(Context context, AbstractC12990ll abstractC12990ll, List list, DialogInterface.OnDismissListener onDismissListener, int i, Object obj) {
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            onDismissListener = null;
        }
        return getSandboxDialog(context, abstractC12990ll, list, onDismissListener);
    }

    private final String getFormattedText(EditText editText) {
        Editable text = editText.getText();
        C14360o3.A07(text);
        int length = text.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A1S = AbstractC31175DnJ.A1S(C14360o3.A00(text.charAt(i2), 32));
            if (!z) {
                if (!A1S) {
                    z = true;
                } else {
                    i++;
                }
            } else {
                if (!A1S) {
                    break;
                }
                length--;
            }
        }
        return AbstractC31178DnM.A0f(text.subSequence(i, length + 1).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processDevServerChange(View view, C17280tP c17280tP, AbstractC12990ll abstractC12990ll) {
        C2d6 c2d6;
        String formattedText = getFormattedText((EditText) AbstractC166987dD.A0c(view, R.id.dev_server));
        int length = formattedText.length();
        c17280tP.A0I(AbstractC167007dF.A1O(length));
        if (length > 0) {
            c17280tP.A0E(C1HO.A05(formattedText));
            C14360o3.A0C(abstractC12990ll, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
            if (L.ig_android_other_category_sandbox_and_gql_endpoint_selectors_unified_experience_variants.is_enabled.getAndExpose(abstractC12990ll).booleanValue()) {
                c17280tP.A0F(formattedText);
                c17280tP.A0J(true);
                String A04 = C1HO.A04(formattedText);
                C14360o3.A07(A04);
                AbstractC11400iy.A00().A01(A04);
            }
        }
        C1HO.A07();
        Object context = view.getContext();
        if ((context instanceof C2d6) && (c2d6 = (C2d6) context) != null) {
            c2d6.DA3(c17280tP);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processMqttChange(View view, C17280tP c17280tP) {
        String formattedText = getFormattedText((EditText) AbstractC166987dD.A0c(view, R.id.dev_mqtt_server));
        int length = formattedText.length();
        boolean A1O = AbstractC167007dF.A1O(length);
        InterfaceC16530ry interfaceC16530ry = c17280tP.A1w;
        C0YR[] c0yrArr = C17280tP.A4G;
        AbstractC167007dF.A1L(c17280tP, interfaceC16530ry, c0yrArr, 53, A1O);
        if (length > 0) {
            if (!AbstractC001900j.A0U(formattedText, '.')) {
                formattedText = AnonymousClass001.A0R(formattedText, ".sb.facebook.com:8883");
            }
            C14360o3.A0B(formattedText, 0);
            AbstractC31171DnF.A1S(c17280tP, formattedText, c17280tP.A2B, c0yrArr, 54);
        }
    }
}
