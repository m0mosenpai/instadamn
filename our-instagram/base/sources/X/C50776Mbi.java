package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import com.instagram.user.model.Product;
import java.util.ArrayList;

/* renamed from: X.Mbi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50776Mbi extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ TagsInteractiveLayout A00;

    public C50776Mbi(TagsInteractiveLayout tagsInteractiveLayout) {
        this.A00 = tagsInteractiveLayout;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        AbstractC50789Mc6 abstractC50789Mc6;
        TagsInteractiveLayout tagsInteractiveLayout = this.A00;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int childCount = tagsInteractiveLayout.getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 0) {
                abstractC50789Mc6 = (AbstractC50789Mc6) tagsInteractiveLayout.getChildAt(childCount);
                if (abstractC50789Mc6.A04) {
                    OXO A01 = AbstractC50789Mc6.A01(abstractC50789Mc6);
                    Rect rect = A01.A09;
                    if (A01.A05(x - rect.left, y - rect.top)) {
                        break;
                    }
                }
            } else {
                abstractC50789Mc6 = null;
                break;
            }
        }
        tagsInteractiveLayout.A04 = abstractC50789Mc6;
        if (abstractC50789Mc6 != null) {
            abstractC50789Mc6.bringToFront();
            boolean z = false;
            if (tagsInteractiveLayout.A04.getTag() == null || !tagsInteractiveLayout.A09.contains(tagsInteractiveLayout.A04.getTaggedId()) ? !(tagsInteractiveLayout.A0E || tagsInteractiveLayout.A04.A06()) : !(tagsInteractiveLayout.A0D || tagsInteractiveLayout.A04.A06())) {
                z = true;
            }
            tagsInteractiveLayout.A0I = z;
            tagsInteractiveLayout.A0F = tagsInteractiveLayout.A04.A07((int) motionEvent.getX(), (int) motionEvent.getY());
            tagsInteractiveLayout.A04 = (AbstractC50789Mc6) tagsInteractiveLayout.getChildAt(tagsInteractiveLayout.getChildCount() - 1);
            tagsInteractiveLayout.invalidate();
        }
        int i = 0;
        while (true) {
            if (i < tagsInteractiveLayout.getChildCount()) {
                AbstractC50789Mc6 abstractC50789Mc62 = (AbstractC50789Mc6) tagsInteractiveLayout.getChildAt(i);
                if (null != abstractC50789Mc62 && abstractC50789Mc62.A06()) {
                    abstractC50789Mc62.A03();
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d4, code lost:
    
        if (r2.A06[0].A00 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x010f, code lost:
    
        if (r2.A06[1].A00 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x012f, code lost:
    
        if (r1[3].A00 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014a, code lost:
    
        if (r2.A06[2].A00 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0169, code lost:
    
        if (r5.A00 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0186, code lost:
    
        if (r2.A06[3].A00 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (((com.instagram.tagging.api.model.MediaSuggestedProductTag) r3).A01 != X.EnumC53230NgS.A04) goto L57;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onScroll(android.view.MotionEvent r36, android.view.MotionEvent r37, float r38, float r39) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50776Mbi.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        PointF pointF;
        TagsInteractiveLayout tagsInteractiveLayout = this.A00;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (tagsInteractiveLayout.A05 != null) {
            tagsInteractiveLayout.AVh();
        } else {
            AbstractC50789Mc6 abstractC50789Mc6 = tagsInteractiveLayout.A04;
            if (abstractC50789Mc6 != null) {
                com.instagram.tagging.model.Tag tag = (com.instagram.tagging.model.Tag) abstractC50789Mc6.getTag();
                if (tag.A01() == EnumC53319Nhv.A09) {
                    MediaSuggestedProductTag mediaSuggestedProductTag = (MediaSuggestedProductTag) tag;
                    if (mediaSuggestedProductTag.A01 == EnumC53230NgS.A04) {
                        InterfaceC58159PqO interfaceC58159PqO = tagsInteractiveLayout.A08;
                        ArrayList arrayList = tagsInteractiveLayout.A0A;
                        ArrayList arrayList2 = tagsInteractiveLayout.A0B;
                        TaggingActivity taggingActivity = (TaggingActivity) interfaceC58159PqO;
                        AbstractC167007dF.A1D(arrayList, 1, arrayList2);
                        Product A07 = mediaSuggestedProductTag.A07();
                        if (A07 != null) {
                            FrameLayout frameLayout = new FrameLayout(taggingActivity);
                            C41626IbH c41626IbH = C41626IbH.A01;
                            View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(frameLayout), frameLayout, R.layout.shopping_item, false);
                            Object A0Q = AbstractC37303Gc4.A0Q(A0C, new IK9(A0C));
                            C14360o3.A0C(A0Q, "null cannot be cast to non-null type com.instagram.tagging.search.ProductListItemViewBinder.Holder");
                            c41626IbH.A00(taggingActivity, new C34470FHi(), new PHD(), (IK9) A0Q, A07);
                            AbstractC31172DnG.A1B(taggingActivity, A0C, AbstractC53242c7.A02(taggingActivity));
                            frameLayout.addView(A0C);
                            C50674MYs c50674MYs = new C50674MYs(taggingActivity, AbstractC166987dD.A0r(taggingActivity.A0o));
                            c50674MYs.A01 = frameLayout;
                            c50674MYs.A01(ViewOnClickListenerC55459OkE.A00(mediaSuggestedProductTag, tagsInteractiveLayout, taggingActivity, 31), 2131952153);
                            c50674MYs.A03(new ViewOnClickListenerC55422OjX(5, arrayList, mediaSuggestedProductTag, arrayList2, taggingActivity, tagsInteractiveLayout), 2131952151);
                            c50674MYs.A03(new ViewOnClickListenerC55417OjS(7, A07, mediaSuggestedProductTag, tagsInteractiveLayout, taggingActivity), 2131952152);
                            C31727DwY.A00(taggingActivity, c50674MYs);
                            return true;
                        }
                    } else {
                        if (!tagsInteractiveLayout.A06.CLc()) {
                            if (tagsInteractiveLayout.A08.Cow(tagsInteractiveLayout, tagsInteractiveLayout.A0A, tagsInteractiveLayout.A0B)) {
                                pointF = AbstractC50789Mc6.A01(abstractC50789Mc6).A06;
                                tagsInteractiveLayout.A08(pointF);
                                return true;
                            }
                        }
                        tagsInteractiveLayout.A06.Elk();
                        return true;
                    }
                } else {
                    if (tagsInteractiveLayout.A0F) {
                        tagsInteractiveLayout.A09(tag);
                        tagsInteractiveLayout.A08.Ds0(null);
                    }
                    if (tagsInteractiveLayout.A0I) {
                        abstractC50789Mc6.A03();
                        return true;
                    }
                }
            } else {
                if (!tagsInteractiveLayout.A06.CLc()) {
                    if (tagsInteractiveLayout.A08.Cow(tagsInteractiveLayout, tagsInteractiveLayout.A0A, tagsInteractiveLayout.A0B)) {
                        pointF = new PointF(x / AbstractC166987dD.A07(tagsInteractiveLayout), MSX.A00(y, tagsInteractiveLayout));
                        tagsInteractiveLayout.A08(pointF);
                        return true;
                    }
                }
                tagsInteractiveLayout.A06.Elk();
                return true;
            }
        }
        return true;
    }
}
