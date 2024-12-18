package X;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;

/* loaded from: classes11.dex */
public final class WIX implements Handler.Callback {
    public final int A00;

    public WIX(int i) {
        this.A00 = i;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ValueAnimator valueAnimator;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        if (this.A00 != 0) {
            int i = message.what;
            if (i != 0) {
                if (i == 1) {
                    AbstractC70175WEx abstractC70175WEx = (AbstractC70175WEx) message.obj;
                    int i2 = message.arg1;
                    AccessibilityManager accessibilityManager = abstractC70175WEx.A08;
                    if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
                        UBZ ubz = abstractC70175WEx.A09;
                        if (ubz.getVisibility() == 0) {
                            if (ubz.A00 == 1) {
                                valueAnimator = ValueAnimator.ofFloat(1.0f, 0.0f);
                                valueAnimator.setInterpolator(AbstractC153306uz.A03);
                                valueAnimator.addUpdateListener(new C65759TtZ(abstractC70175WEx, 5));
                                valueAnimator.setDuration(75L);
                                valueAnimator.addListener(new C66298U7w(abstractC70175WEx, i2, 0));
                            } else {
                                valueAnimator = new ValueAnimator();
                                int height = ubz.getHeight();
                                ViewGroup.LayoutParams layoutParams = ubz.getLayoutParams();
                                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                    height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                                }
                                valueAnimator.setIntValues(0, height);
                                valueAnimator.setInterpolator(AbstractC153306uz.A02);
                                valueAnimator.setDuration(250L);
                                valueAnimator.addListener(new C66298U7w(abstractC70175WEx, i2, 1));
                                valueAnimator.addUpdateListener(new C65759TtZ(abstractC70175WEx, 8));
                            }
                            valueAnimator.start();
                            return true;
                        }
                    }
                    abstractC70175WEx.A05();
                    return true;
                }
                return false;
            }
            AbstractC70175WEx abstractC70175WEx2 = (AbstractC70175WEx) message.obj;
            UBZ ubz2 = abstractC70175WEx2.A09;
            ubz2.A02 = new C70539WcT(abstractC70175WEx2);
            if (ubz2.getParent() == null) {
                ViewGroup.LayoutParams layoutParams2 = ubz2.getLayoutParams();
                if (layoutParams2 instanceof C56292iI) {
                    C56292iI c56292iI = (C56292iI) layoutParams2;
                    BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                    baseTransientBottomBar$Behavior.A00.A00 = abstractC70175WEx2.A04;
                    baseTransientBottomBar$Behavior.A04 = new WcO(abstractC70175WEx2);
                    c56292iI.A00(baseTransientBottomBar$Behavior);
                    c56292iI.A03 = 80;
                }
                AbstractC70175WEx.A02(abstractC70175WEx2);
                ubz2.setVisibility(4);
                abstractC70175WEx2.A07.addView(ubz2);
            }
            if (ubz2.isLaidOut()) {
                AbstractC70175WEx.A01(abstractC70175WEx2);
                return true;
            }
            ubz2.A03 = new WcU(abstractC70175WEx2);
            return true;
        }
        if (message.what == 1) {
            QBZ qbz = (QBZ) message.obj;
            qbz.A00.A00(qbz);
            return true;
        }
        return false;
    }
}
