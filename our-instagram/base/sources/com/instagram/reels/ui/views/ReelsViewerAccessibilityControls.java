package com.instagram.reels.ui.views;

import X.AbstractC56932jR;
import X.C14360o3;
import X.C16930sl;
import X.C38321qM;
import X.C41181vS;
import X.InterfaceC1118853a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.reels.ui.views.ReelsViewerAccessibilityControls;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class ReelsViewerAccessibilityControls extends IgFrameLayout {
    public InterfaceC1118853a A00;
    public final View.AccessibilityDelegate A01;
    public final ViewGroup A02;
    public final IgdsMediaButton A03;
    public final IgdsMediaButton A04;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReelsViewerAccessibilityControls(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public final void setAccessibilityCaption(C41181vS c41181vS) {
        C14360o3.A0B(c41181vS, 0);
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null) {
            setImportantForAccessibility(1);
            StringBuilder sb = new StringBuilder();
            String AXw = c38321qM.A0C.AXw();
            if (c41181vS.A1b()) {
                sb = new StringBuilder(getContext().getString(2131976620));
                setAccessibilityDelegate(this.A01);
            } else if (!c41181vS.A1b() && AXw != null) {
                sb = new StringBuilder(AXw);
            }
            List C6n = c38321qM.A0C.C6n();
            if (C6n == null) {
                C6n = C16930sl.A00;
            }
            if (C6n.size() == 1) {
                AbstractC56932jR.A09(getContext().getString(2131971947, C6n.get(0)), sb, true);
            } else if (C6n.size() > 1) {
                int size = C6n.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    AbstractC56932jR.A09(getContext().getString(2131971946, Integer.valueOf(i2), C6n.get(i)), sb, true);
                    i = i2;
                }
            }
            setContentDescription(sb);
        }
    }

    public final void setDelegate(InterfaceC1118853a interfaceC1118853a) {
        C14360o3.A0B(interfaceC1118853a, 0);
        this.A00 = interfaceC1118853a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.6cX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.6cX, java.lang.Object] */
    public ReelsViewerAccessibilityControls(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        View.inflate(context, R.layout.reel_accessibility_controls, this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.reel_accessibility_controls_layout);
        this.A02 = viewGroup;
        this.A01 = new View.AccessibilityDelegate() { // from class: X.6qo
            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                C14360o3.A0B(view, 0);
                C14360o3.A0B(accessibilityNodeInfo, 1);
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, context.getString(2131971948)));
                accessibilityNodeInfo.setClickable(true);
            }
        };
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) viewGroup.findViewById(R.id.previous_story_button);
        this.A04 = igdsMediaButton;
        Drawable drawable = context.getDrawable(R.drawable.chevron_left);
        if (drawable != null) {
            drawable.setAutoMirrored(true);
            ?? obj = new Object();
            obj.A01 = drawable;
            igdsMediaButton.setStartAddOn(obj, getResources().getString(2131971922));
        }
        igdsMediaButton.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: X.6qp
            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                C14360o3.A0B(view, 0);
                C14360o3.A0B(accessibilityNodeInfo, 1);
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, context.getString(2131971923)));
            }
        });
        igdsMediaButton.setOnClickListener(new View.OnClickListener() { // from class: X.6qq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1608467948);
                InterfaceC1118853a interfaceC1118853a = ReelsViewerAccessibilityControls.this.A00;
                if (interfaceC1118853a != null) {
                    interfaceC1118853a.E63(false);
                }
                AbstractC56932jR.A02(view);
                C0f9.A0C(1317343118, A05);
            }
        });
        igdsMediaButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.6qr
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                InterfaceC1118853a interfaceC1118853a = ReelsViewerAccessibilityControls.this.A00;
                if (interfaceC1118853a != null) {
                    interfaceC1118853a.E63(true);
                }
                return true;
            }
        });
        IgdsMediaButton igdsMediaButton2 = (IgdsMediaButton) viewGroup.findViewById(R.id.next_story_button);
        this.A03 = igdsMediaButton2;
        Drawable drawable2 = context.getDrawable(R.drawable.chevron_right);
        if (drawable2 != null) {
            drawable2.setAutoMirrored(true);
            ?? obj2 = new Object();
            obj2.A01 = drawable2;
            igdsMediaButton2.setStartAddOn(obj2, getResources().getString(2131971915));
        }
        igdsMediaButton2.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: X.6qs
            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                C14360o3.A0B(view, 0);
                C14360o3.A0B(accessibilityNodeInfo, 1);
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, context.getString(2131971916)));
            }
        });
        igdsMediaButton2.setOnClickListener(new View.OnClickListener() { // from class: X.6qt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(2066556744);
                InterfaceC1118853a interfaceC1118853a = ReelsViewerAccessibilityControls.this.A00;
                if (interfaceC1118853a != null) {
                    interfaceC1118853a.Csv(false);
                }
                AbstractC56932jR.A02(view);
                C0f9.A0C(-1989588710, A05);
            }
        });
        igdsMediaButton2.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.6qu
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                InterfaceC1118853a interfaceC1118853a = ReelsViewerAccessibilityControls.this.A00;
                if (interfaceC1118853a != null) {
                    interfaceC1118853a.Csv(true);
                }
                return true;
            }
        });
    }

    public /* synthetic */ ReelsViewerAccessibilityControls(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReelsViewerAccessibilityControls(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
