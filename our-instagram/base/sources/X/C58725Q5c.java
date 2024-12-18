package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import com.airbnb.lottie.LottieAnimationView$SavedState;
import com.facebook.R;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.zip.ZipInputStream;
import javax.net.ssl.SSLException;

/* renamed from: X.Q5c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58725Q5c extends C128955sF {
    public static final InterfaceC65307Thj A0D = new InterfaceC65307Thj() { // from class: X.SrT
        @Override // X.InterfaceC65307Thj
        public final void onResult(Object obj) {
            Throwable th = (Throwable) obj;
            if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
                throw new IllegalStateException("Unable to parse composition", th);
            }
            SQZ.A01("Unable to load composition.", th);
        }
    };
    public int A00;
    public InterfaceC65307Thj A01;
    public boolean A02;
    public boolean A03;
    public int A04;
    public C63338Shs A05;
    public String A06;
    public boolean A07;
    public final Q2O A08;
    public final java.util.Set A09;
    public final InterfaceC65307Thj A0A;
    public final InterfaceC65307Thj A0B;
    public final java.util.Set A0C;

    public C58725Q5c(Context context) {
        super(context, null, 0);
        String string;
        this.A0A = new C63662SrV(this);
        this.A0B = new C63661SrU(this);
        this.A00 = 0;
        this.A08 = new Q2O();
        this.A07 = false;
        this.A02 = false;
        this.A03 = true;
        this.A09 = AbstractC166987dD.A1H();
        this.A0C = AbstractC166987dD.A1H();
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(null, AbstractC62301S5w.A00, R.attr.lottieAnimationViewStyle, 0);
        this.A03 = obtainStyledAttributes.getBoolean(2, true);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        boolean hasValue2 = obtainStyledAttributes.hasValue(9);
        boolean hasValue3 = obtainStyledAttributes.hasValue(19);
        if (hasValue) {
            if (!hasValue2) {
                int resourceId = obtainStyledAttributes.getResourceId(14, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else {
                throw AbstractC166987dD.A12("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(9);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(19)) != null) {
            setAnimationFromUrl(string);
        }
        this.A00 = obtainStyledAttributes.getResourceId(8, 0);
        if (obtainStyledAttributes.getBoolean(1, false)) {
            this.A02 = true;
        }
        if (obtainStyledAttributes.getBoolean(12, false)) {
            this.A08.A0c.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(17)) {
            setRepeatMode(obtainStyledAttributes.getInt(17, 1));
        }
        if (obtainStyledAttributes.hasValue(16)) {
            setRepeatCount(obtainStyledAttributes.getInt(16, -1));
        }
        if (obtainStyledAttributes.hasValue(18)) {
            setSpeed(obtainStyledAttributes.getFloat(18, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(4, true));
        }
        if (obtainStyledAttributes.hasValue(3)) {
            setClipTextToBoundingBox(obtainStyledAttributes.getBoolean(3, false));
        }
        if (obtainStyledAttributes.hasValue(6)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(6));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(11));
        boolean hasValue4 = obtainStyledAttributes.hasValue(13);
        float f = obtainStyledAttributes.getFloat(13, 0.0f);
        if (hasValue4) {
            this.A09.add(EnumC61127Rfh.SET_PROGRESS);
        }
        Q2O q2o = this.A08;
        q2o.A0C(f);
        boolean z = obtainStyledAttributes.getBoolean(7, false);
        if (q2o.A0R != z) {
            q2o.A0R = z;
            if (q2o.A0F != null) {
                Q2O.A03(q2o);
            }
        }
        if (obtainStyledAttributes.hasValue(5)) {
            q2o.A0H(new C63221SfR("**"), new C62961SZe(new PorterDuffColorFilter(C02G.A02(context2, obtainStyledAttributes.getResourceId(5, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)), InterfaceC65609To0.A01);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            int i = obtainStyledAttributes.getInt(15, 0);
            setRenderMode(EnumC61098RfC.values()[i >= EnumC61098RfC.values().length ? 0 : i]);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            int i2 = obtainStyledAttributes.getInt(0, 0);
            setAsyncUpdates(EnumC61089Rf3.values()[i2 >= EnumC61098RfC.values().length ? 0 : i2]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(10, false));
        if (obtainStyledAttributes.hasValue(20)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(20, false));
        }
        obtainStyledAttributes.recycle();
        q2o.A0Z = AbstractC31174DnI.A1b(Settings.Global.getFloat(context2.getContentResolver(), AbstractC111324zv.A00(172), 1.0f) != 0.0f);
    }

    public void setAnimation(final InputStream inputStream, String str) {
        setCompositionTask(AbstractC63385Sj0.A05(new Runnable() { // from class: X.TJQ
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC63359SiH.A04(inputStream);
            }
        }, str, new TUH(str, inputStream, 2)));
    }

    @Override // X.C128955sF, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.A04 = 0;
        this.A06 = null;
        A00();
        super.setImageBitmap(bitmap);
    }

    @Override // X.C128955sF, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.A04 = 0;
        this.A06 = null;
        A00();
        super.setImageDrawable(drawable);
    }

    @Override // X.C128955sF, android.widget.ImageView
    public void setImageResource(int i) {
        this.A04 = 0;
        this.A06 = null;
        A00();
        super.setImageResource(i);
    }

    private void A00() {
        C63338Shs c63338Shs = this.A05;
        if (c63338Shs != null) {
            InterfaceC65307Thj interfaceC65307Thj = this.A0A;
            synchronized (c63338Shs) {
                c63338Shs.A02.remove(interfaceC65307Thj);
            }
            C63338Shs c63338Shs2 = this.A05;
            InterfaceC65307Thj interfaceC65307Thj2 = this.A0B;
            synchronized (c63338Shs2) {
                c63338Shs2.A01.remove(interfaceC65307Thj2);
            }
        }
    }

    private void setCompositionTask(C63338Shs c63338Shs) {
        C62958SZa c62958SZa = c63338Shs.A03;
        Q2O q2o = this.A08;
        if (c62958SZa != null && q2o == getDrawable() && q2o.A0F == c62958SZa.A00) {
            return;
        }
        this.A09.add(EnumC61127Rfh.SET_ANIMATION);
        q2o.A06();
        A00();
        c63338Shs.A03(this.A0A);
        c63338Shs.A02(this.A0B);
        this.A05 = c63338Shs;
    }

    public EnumC61089Rf3 getAsyncUpdates() {
        EnumC61089Rf3 enumC61089Rf3 = this.A08.A0C;
        if (enumC61089Rf3 == null) {
            return S9I.A00;
        }
        return enumC61089Rf3;
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.A08.A0L();
    }

    public boolean getClipTextToBoundingBox() {
        return this.A08.A0P;
    }

    public boolean getClipToCompositionBounds() {
        return this.A08.A0Q;
    }

    public int getFrame() {
        return (int) this.A08.A0c.A00;
    }

    public String getImageAssetsFolder() {
        return this.A08.A0N;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.A08.A0V;
    }

    public float getMaxFrame() {
        return this.A08.A0c.A01();
    }

    public float getMinFrame() {
        return this.A08.A0c.A02();
    }

    public SH8 getPerformanceTracker() {
        SQ2 sq2 = this.A08.A0F;
        if (sq2 != null) {
            return sq2.A0D;
        }
        return null;
    }

    public float getProgress() {
        return this.A08.A0c.A00();
    }

    public EnumC61098RfC getRenderMode() {
        if (this.A08.A0a) {
            return EnumC61098RfC.SOFTWARE;
        }
        return EnumC61098RfC.HARDWARE;
    }

    public int getRepeatCount() {
        return this.A08.A0c.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.A08.A0c.getRepeatMode();
    }

    public float getSpeed() {
        return this.A08.A0c.A04;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof LottieAnimationView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        LottieAnimationView$SavedState lottieAnimationView$SavedState = (LottieAnimationView$SavedState) parcelable;
        super.onRestoreInstanceState(lottieAnimationView$SavedState.getSuperState());
        this.A06 = lottieAnimationView$SavedState.A04;
        java.util.Set set = this.A09;
        EnumC61127Rfh enumC61127Rfh = EnumC61127Rfh.SET_ANIMATION;
        if (!set.contains(enumC61127Rfh) && !TextUtils.isEmpty(this.A06)) {
            setAnimation(this.A06);
        }
        this.A04 = lottieAnimationView$SavedState.A01;
        if (!set.contains(enumC61127Rfh) && (i = this.A04) != 0) {
            setAnimation(i);
        }
        if (!set.contains(EnumC61127Rfh.SET_PROGRESS)) {
            this.A08.A0C(lottieAnimationView$SavedState.A00);
        }
        EnumC61127Rfh enumC61127Rfh2 = EnumC61127Rfh.PLAY_OPTION;
        if (!set.contains(enumC61127Rfh2) && lottieAnimationView$SavedState.A06) {
            set.add(enumC61127Rfh2);
            this.A08.A08();
        }
        if (!set.contains(EnumC61127Rfh.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(lottieAnimationView$SavedState.A05);
        }
        if (!set.contains(EnumC61127Rfh.SET_REPEAT_MODE)) {
            setRepeatMode(lottieAnimationView$SavedState.A03);
        }
        if (set.contains(EnumC61127Rfh.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(lottieAnimationView$SavedState.A02);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.A08.A0T = z;
    }

    public void setAsyncUpdates(EnumC61089Rf3 enumC61089Rf3) {
        this.A08.A0C = enumC61089Rf3;
    }

    public void setClipTextToBoundingBox(boolean z) {
        Q2O q2o = this.A08;
        if (z != q2o.A0P) {
            q2o.A0P = z;
            q2o.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z) {
        Q2O q2o = this.A08;
        if (z != q2o.A0Q) {
            q2o.A0Q = z;
            C58808QAr c58808QAr = q2o.A0K;
            if (c58808QAr != null) {
                c58808QAr.A01 = z;
            }
            q2o.invalidateSelf();
        }
    }

    public void setComposition(SQ2 sq2) {
        boolean z;
        Q2O q2o = this.A08;
        q2o.setCallback(this);
        this.A07 = true;
        boolean A0M = q2o.A0M(sq2);
        if (this.A02) {
            q2o.A08();
        }
        this.A07 = false;
        if (getDrawable() == q2o) {
            if (!A0M) {
                return;
            }
        } else if (!A0M) {
            ChoreographerFrameCallbackC58691Q0f choreographerFrameCallbackC58691Q0f = q2o.A0c;
            if (choreographerFrameCallbackC58691Q0f == null) {
                z = false;
            } else {
                z = choreographerFrameCallbackC58691Q0f.A08;
            }
            setImageDrawable(null);
            setImageDrawable(q2o);
            if (z) {
                q2o.A09();
            }
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator it = this.A0C.iterator();
        if (!it.hasNext()) {
            return;
        }
        it.next();
        throw AbstractC166987dD.A15("onCompositionLoaded");
    }

    public void setDefaultFontFileExtension(String str) {
        Q2O q2o = this.A08;
        q2o.A0M = str;
        if (q2o.getCallback() != null) {
            SIb sIb = q2o.A0I;
            if (sIb == null) {
                sIb = new SIb(q2o.getCallback());
                q2o.A0I = sIb;
                String str2 = q2o.A0M;
                if (str2 != null) {
                    sIb.A01 = str2;
                }
            }
            sIb.A01 = str;
        }
    }

    public void setFontAssetDelegate(AbstractC61274Rkk abstractC61274Rkk) {
        Q2O q2o = this.A08;
        q2o.A0D = abstractC61274Rkk;
        SIb sIb = q2o.A0I;
        if (sIb != null) {
            sIb.A00 = abstractC61274Rkk;
        }
    }

    public void setFontMap(Map map) {
        Q2O q2o = this.A08;
        if (map != q2o.A0O) {
            q2o.A0O = map;
            q2o.invalidateSelf();
        }
    }

    public void setFrame(int i) {
        this.A08.A0D(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.A08.A0S = z;
    }

    public void setImageAssetDelegate(InterfaceC65194Tfc interfaceC65194Tfc) {
        Q2O q2o = this.A08;
        q2o.A0E = interfaceC65194Tfc;
        C62909SWq c62909SWq = q2o.A0J;
        if (c62909SWq != null) {
            c62909SWq.A00 = interfaceC65194Tfc;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.A08.A0N = str;
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.A08.A0V = z;
    }

    public void setMaxFrame(int i) {
        this.A08.A0E(i);
    }

    public void setMaxProgress(float f) {
        this.A08.A0A(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.A08.A0J(str);
    }

    public void setMinFrame(int i) {
        this.A08.A0F(i);
    }

    public void setMinProgress(float f) {
        this.A08.A0B(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        Q2O q2o = this.A08;
        if (q2o.A0W != z) {
            q2o.A0W = z;
            C58808QAr c58808QAr = q2o.A0K;
            if (c58808QAr != null) {
                c58808QAr.A0E(z);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        Q2O q2o = this.A08;
        q2o.A0X = z;
        SQ2 sq2 = q2o.A0F;
        if (sq2 != null) {
            sq2.A0D.A00 = z;
        }
    }

    public void setProgress(float f) {
        this.A09.add(EnumC61127Rfh.SET_PROGRESS);
        this.A08.A0C(f);
    }

    public void setRenderMode(EnumC61098RfC enumC61098RfC) {
        Q2O q2o = this.A08;
        q2o.A0G = enumC61098RfC;
        Q2O.A04(q2o);
    }

    public void setRepeatCount(int i) {
        this.A09.add(EnumC61127Rfh.SET_REPEAT_COUNT);
        this.A08.A0c.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.A09.add(EnumC61127Rfh.SET_REPEAT_MODE);
        this.A08.A0c.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.A08.A0Y = z;
    }

    public void setSpeed(float f) {
        this.A08.A0c.A04 = f;
    }

    public void setTextDelegate(AbstractC61275Rkl abstractC61275Rkl) {
        this.A08.A0H = abstractC61275Rkl;
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.A08.A0c.A09 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (r0.A08 != false) goto L11;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void unscheduleDrawable(android.graphics.drawable.Drawable r3) {
        /*
            r2 = this;
            boolean r0 = r2.A07
            if (r0 != 0) goto L16
            X.Q2O r1 = r2.A08
            if (r3 != r1) goto L1a
            X.Q0f r0 = r1.A0c
            if (r0 == 0) goto L1a
            boolean r0 = r0.A08
            if (r0 == 0) goto L1a
            r0 = 0
            r2.A02 = r0
        L13:
            r1.A07()
        L16:
            super.unscheduleDrawable(r3)
            return
        L1a:
            boolean r0 = r3 instanceof X.Q2O
            if (r0 == 0) goto L16
            r1 = r3
            X.Q2O r1 = (X.Q2O) r1
            X.Q0f r0 = r1.A0c
            if (r0 == 0) goto L16
            boolean r0 = r0.A08
            if (r0 == 0) goto L16
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58725Q5c.unscheduleDrawable(android.graphics.drawable.Drawable):void");
    }

    public SQ2 getComposition() {
        Drawable drawable = getDrawable();
        Q2O q2o = this.A08;
        if (drawable == q2o) {
            return q2o.A0F;
        }
        return null;
    }

    public long getDuration() {
        if (getComposition() != null) {
            return r0.A00();
        }
        return 0L;
    }

    @Override // android.view.View
    public final void invalidate() {
        EnumC61098RfC enumC61098RfC;
        int A03 = C0f9.A03(-212768766);
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof Q2O) {
            if (((Q2O) drawable).A0a) {
                enumC61098RfC = EnumC61098RfC.SOFTWARE;
            } else {
                enumC61098RfC = EnumC61098RfC.HARDWARE;
            }
            if (enumC61098RfC == EnumC61098RfC.SOFTWARE) {
                this.A08.invalidateSelf();
            }
        }
        C0f9.A0A(-1392944556, A03);
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        Q2O q2o = this.A08;
        if (drawable2 == q2o) {
            super.invalidateDrawable(q2o);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-1997867980);
        super.onAttachedToWindow();
        if (!isInEditMode() && this.A02) {
            this.A08.A08();
        }
        C0f9.A0D(461278712, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if (r1 == X.C05F.A0C) goto L11;
     */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, com.airbnb.lottie.LottieAnimationView$SavedState] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r6 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.airbnb.lottie.LottieAnimationView$SavedState r5 = new com.airbnb.lottie.LottieAnimationView$SavedState
            r5.<init>(r0)
            java.lang.String r0 = r6.A06
            r5.A04 = r0
            int r0 = r6.A04
            r5.A01 = r0
            X.Q2O r4 = r6.A08
            X.Q0f r3 = r4.A0c
            float r0 = r3.A00()
            r5.A00 = r0
            boolean r0 = r4.isVisible()
            if (r0 == 0) goto L36
            boolean r2 = r3.A08
        L23:
            r5.A06 = r2
            java.lang.String r0 = r4.A0N
            r5.A05 = r0
            int r0 = r3.getRepeatMode()
            r5.A03 = r0
            int r0 = r3.getRepeatCount()
            r5.A02 = r0
            return r5
        L36:
            java.lang.Integer r1 = r4.A0L
            java.lang.Integer r0 = X.C05F.A01
            if (r1 == r0) goto L41
            java.lang.Integer r0 = X.C05F.A0C
            r2 = 0
            if (r1 != r0) goto L23
        L41:
            r2 = 1
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58725Q5c.onSaveInstanceState():android.os.Parcelable");
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimationFromUrl(String str, String str2) {
        setCompositionTask(AbstractC63385Sj0.A05(null, str2, new TUS(getContext(), str, str2, 1)));
    }

    public void setCacheComposition(boolean z) {
        this.A03 = z;
    }

    public void setFailureListener(InterfaceC65307Thj interfaceC65307Thj) {
        this.A01 = interfaceC65307Thj;
    }

    public void setFallbackResource(int i) {
        this.A00 = i;
    }

    public void setAnimation(int i) {
        C63338Shs c63338Shs;
        this.A04 = i;
        this.A06 = null;
        if (isInEditMode()) {
            Executor executor = C63338Shs.A04;
            c63338Shs = new C63338Shs(new CallableC208669La(this, i, 0), true);
        } else {
            boolean z = this.A03;
            Context context = getContext();
            if (z) {
                String A07 = AbstractC63385Sj0.A07(context, i);
                c63338Shs = AbstractC63385Sj0.A05(null, A07, new TUU(context.getApplicationContext(), AbstractC25225BEi.A16(context), A07, i, 0));
            } else {
                c63338Shs = new C63338Shs(new TUU(context.getApplicationContext(), AbstractC25225BEi.A16(context), null, i, 0), false);
            }
        }
        setCompositionTask(c63338Shs);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        C63338Shs c63338Shs;
        boolean z = this.A03;
        Context context = getContext();
        if (z) {
            String A0R = AnonymousClass001.A0R("url_", str);
            c63338Shs = AbstractC63385Sj0.A05(null, A0R, new TUS(context, str, A0R, 1));
        } else {
            c63338Shs = new C63338Shs(new TUS(context, str, null, 1), false);
        }
        setCompositionTask(c63338Shs);
    }

    public void setMaxFrame(String str) {
        this.A08.A0I(str);
    }

    public void setMinFrame(String str) {
        this.A08.A0K(str);
    }

    public void setAnimation(final ZipInputStream zipInputStream, String str) {
        setCompositionTask(AbstractC63385Sj0.A05(new Runnable() { // from class: X.TJR
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC63359SiH.A04(zipInputStream);
            }
        }, str, new TUH(str, zipInputStream, 3)));
    }

    public void setAnimation(String str) {
        C63338Shs c63338Shs;
        this.A06 = str;
        this.A04 = 0;
        if (isInEditMode()) {
            Executor executor = C63338Shs.A04;
            c63338Shs = new C63338Shs(new TUH(str, this, 1), true);
        } else {
            boolean z = this.A03;
            Context context = getContext();
            if (z) {
                String A0R = AnonymousClass001.A0R("asset_", str);
                c63338Shs = AbstractC63385Sj0.A05(null, A0R, new TUS(context.getApplicationContext(), str, A0R, 0));
            } else {
                c63338Shs = new C63338Shs(new TUS(context.getApplicationContext(), str, null, 0), false);
            }
        }
        setCompositionTask(c63338Shs);
    }
}
