package com.instagram.ui.widget.proxy;

import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.ui.widget.proxy.ProxyFrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class ProxyFrameLayout extends FrameLayout {
    public View.OnClickListener A00;
    public boolean A01;
    public final List A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProxyFrameLayout(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A02 = new ArrayList();
        this.A01 = true;
        super.setOnClickListener(new View.OnClickListener() { // from class: X.2lM
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1898585963);
                C14360o3.A0B(view, 0);
                ProxyFrameLayout proxyFrameLayout = ProxyFrameLayout.this;
                Iterator it = proxyFrameLayout.A02.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                View.OnClickListener onClickListener = proxyFrameLayout.A00;
                if (onClickListener != null && proxyFrameLayout.A01) {
                    onClickListener.onClick(view);
                }
                C0f9.A0C(-1147576667, A05);
            }
        });
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }

    public final void setProxyToOnClickListener(boolean z) {
        this.A01 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProxyFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A02 = new ArrayList();
        this.A01 = true;
        super.setOnClickListener(new View.OnClickListener() { // from class: X.2lM
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1898585963);
                C14360o3.A0B(view, 0);
                ProxyFrameLayout proxyFrameLayout = ProxyFrameLayout.this;
                Iterator it = proxyFrameLayout.A02.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                View.OnClickListener onClickListener = proxyFrameLayout.A00;
                if (onClickListener != null && proxyFrameLayout.A01) {
                    onClickListener.onClick(view);
                }
                C0f9.A0C(-1147576667, A05);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProxyFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A02 = new ArrayList();
        this.A01 = true;
        super.setOnClickListener(new View.OnClickListener() { // from class: X.2lM
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1898585963);
                C14360o3.A0B(view, 0);
                ProxyFrameLayout proxyFrameLayout = ProxyFrameLayout.this;
                Iterator it = proxyFrameLayout.A02.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                View.OnClickListener onClickListener = proxyFrameLayout.A00;
                if (onClickListener != null && proxyFrameLayout.A01) {
                    onClickListener.onClick(view);
                }
                C0f9.A0C(-1147576667, A05);
            }
        });
    }
}
