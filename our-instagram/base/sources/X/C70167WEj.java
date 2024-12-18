package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.WEj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70167WEj {
    public int A00;
    public int A01;
    public C50627MWo A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final FrameLayout A09;
    public final java.util.Set A0A;
    public final ConcurrentLinkedQueue A0B;
    public final C66626UPo[] A0C;
    public final UAE[] A0D;
    public final long A0E;
    public final WYT A0F;

    public C70167WEj(Context context, long j) {
        this.A0E = j;
        this.A09 = new FrameLayout(context);
        int i = 0;
        UAE[] uaeArr = {new UAE(context, 0), new UAE(context, 1)};
        this.A0D = uaeArr;
        this.A0C = new C66626UPo[]{new C66626UPo(0, 0, 0.0f), new C66626UPo(0, 0, 0.0f)};
        this.A0B = new ConcurrentLinkedQueue();
        this.A0F = new WYT(this);
        java.util.Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        C14360o3.A07(newSetFromMap);
        this.A0A = newSetFromMap;
        this.A01 = -1;
        do {
            UAE uae = uaeArr[i];
            uae.setPlayerListener(this.A0F);
            uae.setAlpha(0.0f);
            this.A09.addView(uae);
            i++;
        } while (i < 2);
    }

    public static final void A02(C70167WEj c70167WEj, String str, boolean z) {
        long j;
        C38686GzR c38686GzR;
        c70167WEj.A05 = true;
        if (c70167WEj.A03 != null) {
            Iterator it = c70167WEj.A0A.iterator();
            while (it.hasNext()) {
                C161917Nb c161917Nb = ((C7NZ) it.next()).A00.A00;
                if (c161917Nb != null && (c38686GzR = (C38686GzR) c161917Nb.A04.get(str)) != null) {
                    Iterator it2 = c161917Nb.A06.iterator();
                    while (it2.hasNext()) {
                        C7UD c7ud = ((C162017Nl) it2.next()).A00;
                        C7F3 c7f3 = c7ud.A02;
                        String str2 = (String) c7ud.A04.invoke();
                        String A00 = c7ud.A00();
                        C14360o3.A0B(A00, 1);
                        C18920wW c18920wW = c7f3.A01;
                        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ai_agent_embodiment_transition");
                        if (A002.isSampled()) {
                            C161957Nf c161957Nf = (C161957Nf) c38686GzR.A01;
                            C161957Nf c161957Nf2 = (C161957Nf) c38686GzR.A00;
                            A002.AAP("transition_trigger", c161957Nf2.A05);
                            A002.AAP("transition_llm_action_name", c161957Nf2.A00);
                            A002.AAP("transition_llm_sentiment_name", c161957Nf2.A02);
                            A002.AAP("transition_llm_intensity_name", c161957Nf2.A01);
                            A002.AAP("transition_previous_state", c161957Nf.A03);
                            A002.AAP("transition_previous_action", c161957Nf.A00);
                            A002.AAP("transition_previous_sentiment", c161957Nf.A02);
                            A002.AAP("transition_previous_intensity", c161957Nf.A01);
                            A002.AAP("transition_policy", c161957Nf2.A04);
                            A002.AAP("thread_session_id", str2);
                            A002.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A00);
                            A002.AAP("video_id", c38686GzR.A04);
                            A002.Cht();
                        }
                    }
                }
            }
        }
        int i = (c70167WEj.A00 + 1) % 2;
        UAE[] uaeArr = c70167WEj.A0D;
        UAE uae = uaeArr[i];
        A01(c70167WEj, i);
        uae.A00();
        uae.bringToFront();
        uae.setAlpha(0.0f);
        UAE uae2 = uaeArr[c70167WEj.A00 % 2];
        uae.clearAnimation();
        uae2.clearAnimation();
        ViewPropertyAnimator animate = uae.animate();
        if (z) {
            j = c70167WEj.A0E;
        } else {
            j = 0;
        }
        animate.setDuration(j).alpha(1.0f).withEndAction(new RunnableC71439Wu1(c70167WEj, uae2)).start();
    }

    public final void A03() {
        this.A02 = null;
        UAE[] uaeArr = this.A0D;
        int i = 0;
        do {
            UAE uae = uaeArr[i];
            uae.A03 = null;
            uae.A06 = false;
            uae.A04 = null;
            Surface surface = uae.A01;
            if (surface != null) {
                surface.release();
            }
            uae.A01 = null;
            SurfaceTexture surfaceTexture = uae.getSurfaceTexture();
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            C4RQ c4rq = uae.A08;
            C4RQ.A05(c4rq, "release", new Object[0]);
            Handler handler = c4rq.A0E;
            handler.sendMessage(handler.obtainMessage(8));
            i++;
        } while (i < 2);
    }

    public final void A04(C50627MWo c50627MWo) {
        C4SS c4ss;
        C4SS c4ss2 = (C4SS) c50627MWo.A01;
        Number number = (Number) c50627MWo.A00;
        if (number != null) {
            number.intValue();
        }
        if (this.A05) {
            this.A02 = c50627MWo;
            return;
        }
        int intValue = number.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    this.A0B.clear();
                    this.A01 = -1;
                    A00(c4ss2, this, true);
                    return;
                }
                throw new RuntimeException();
            }
            this.A0B.clear();
            A00(c4ss2, this, false);
            return;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = this.A0B;
        concurrentLinkedQueue.add(c4ss2);
        if (this.A06 || concurrentLinkedQueue.isEmpty() || (c4ss = (C4SS) concurrentLinkedQueue.poll()) == null) {
            return;
        }
        A00(c4ss, this, false);
    }

    public static final void A00(C4SS c4ss, C70167WEj c70167WEj, boolean z) {
        String str = c4ss.A0K.A0G;
        UAE uae = c70167WEj.A0D[(c70167WEj.A00 + 1) % 2];
        c70167WEj.A03 = str;
        c70167WEj.A04 = null;
        C4RQ c4rq = uae.A08;
        C4RQ.A05(c4rq, "stop", new Object[0]);
        Handler handler = c4rq.A0E;
        handler.sendMessage(handler.obtainMessage(37));
        uae.A02(c4ss, z);
        c70167WEj.A06 = true;
    }

    public static final void A01(C70167WEj c70167WEj, int i) {
        int height;
        int i2;
        float f;
        if (i == c70167WEj.A00 % 2) {
            C66626UPo c66626UPo = c70167WEj.A0C[i];
            if (c66626UPo.A04) {
                FrameLayout frameLayout = c70167WEj.A09;
                if (frameLayout.getWidth() > 0 && frameLayout.getHeight() > 0 && frameLayout.getParent() != null) {
                    View A0E = AbstractC43594JPz.A0E(frameLayout);
                    if (A0E.getWidth() > 0 && A0E.getHeight() > 0) {
                        float width = A0E.getWidth() / A0E.getHeight();
                        float f2 = c66626UPo.A00;
                        float f3 = 0.0f;
                        if (f2 <= width) {
                            i2 = A0E.getWidth();
                            height = (int) (i2 / f2);
                            f = (A0E.getHeight() - height) * 0.0f;
                        } else {
                            height = A0E.getHeight();
                            i2 = (int) (height * f2);
                            f3 = (A0E.getWidth() - i2) * 0.0f;
                            f = 0.0f;
                        }
                        frameLayout.getLayoutParams().width = i2;
                        AbstractC43592JPx.A1F(frameLayout, height);
                        frameLayout.setX(f3);
                        frameLayout.setY(f);
                        frameLayout.requestLayout();
                    }
                }
            }
        }
    }
}
