package com.instagram.business.instantexperiences.ui;

import X.AbstractC08820cl;
import X.AbstractC166987dD;
import X.AbstractC31173DnH;
import X.C63283Sgi;
import X.DialogInterfaceOnClickListenerC63420Sjy;
import X.InterfaceC65290ThN;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public class InstantExperiencesBrowserChrome extends LinearLayout {
    public Context A00;
    public FrameLayout A01;
    public ImageView A02;
    public ImageView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public InterfaceC65290ThN A07;
    public C63283Sgi A08;
    public UserSession A09;
    public Executor A0A;
    public final DialogInterface.OnClickListener A0B;

    public InstantExperiencesBrowserChrome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0B = new DialogInterfaceOnClickListenerC63420Sjy(this, 17);
        this.A00 = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CharSequence[] getMenuOptions() {
        Uri A03;
        ArrayList A1E = AbstractC166987dD.A1E();
        CharSequence[] charSequenceArr = new CharSequence[A1E.size()];
        Context context = getContext();
        AbstractC31173DnH.A17(context, A1E, 2131964569);
        AbstractC31173DnH.A17(context, A1E, 2131964565);
        if (this.A08.A0D.peek() != null && C63283Sgi.A01(this) != null && (A03 = AbstractC08820cl.A03(C63283Sgi.A01(this))) != null && ("http".equals(A03.getScheme()) || "https".equals(A03.getScheme()))) {
            AbstractC31173DnH.A17(context, A1E, 2131964568);
        }
        AbstractC31173DnH.A17(context, A1E, 2131964564);
        return (CharSequence[]) A1E.toArray(charSequenceArr);
    }

    public void setInstantExperiencesBrowserChromeListener(InterfaceC65290ThN interfaceC65290ThN) {
        this.A07 = interfaceC65290ThN;
    }

    public InstantExperiencesBrowserChrome(Context context) {
        super(context);
        this.A0B = new DialogInterfaceOnClickListenerC63420Sjy(this, 17);
    }
}
