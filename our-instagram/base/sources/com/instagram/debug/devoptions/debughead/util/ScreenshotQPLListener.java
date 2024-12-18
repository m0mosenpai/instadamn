package com.instagram.debug.devoptions.debughead.util;

import X.AbstractC001800i;
import X.AbstractC07060Yy;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC16830sb;
import X.AbstractC16960so;
import X.AbstractC208410g;
import X.AbstractC25225BEi;
import X.AbstractC43592JPx;
import X.AbstractC61879RvB;
import X.AnonymousClass001;
import X.C00O;
import X.C06650Xb;
import X.C09530e4;
import X.C0XJ;
import X.C0XX;
import X.C0YY;
import X.C0eB;
import X.C0eT;
import X.C0fK;
import X.C12L;
import X.C14360o3;
import X.C1KP;
import X.InterfaceC16660sJ;
import android.R;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Environment;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.LruCache;
import android.view.Display;
import android.view.View;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public final class ScreenshotQPLListener extends AbstractC208410g {
    public static final ScreenshotQPLListener INSTANCE = new Object();
    public static final int[] markers = new int[0];
    public static final Map pointsAllowList = AbstractC167007dF.A0n(15335435, AbstractC16830sb.A07("APP_ONCREATE_END", "ACTIVITY_ONCREATE_END", "FRAGMENT_RESUMED", "CACHED_FEED_END", "CACHED_STORIES_TRAY_END", "NETWORK_STORIES_TRAY_UI_RENDER_END", "NETWORK_STORIES_TRAY_UI_RENDER_STRICT_END", "NETWORK_FEED_UI_RENDER_END", "CACHED_FEED_UI_RENDER_END", "FIRST_MEDIA_FROM_CACHE_CONTENT_LOAD_END", "STORIES_TRAY_POPULATED", "FIRST_MEDIA_LOAD_END"));
    public static WeakReference activityRef = AbstractC25225BEi.A16(null);
    public static final LruCache uxflowScreenshots = new LruCache(100);
    public static final HashMap cache = AbstractC166987dD.A1G();

    /* loaded from: classes8.dex */
    public final class ScreenshotData {
        public Bitmap bitmap;
        public String step;
        public final long timespent;
        public final long timestamp;
        public C1KP uxEvent;

        public ScreenshotData(String str, long j, long j2) {
            C14360o3.A0B(str, 1);
            this.step = str;
            this.timespent = j;
            this.timestamp = j2;
            C09530e4 c09530e4 = (C09530e4) ScreenshotQPLListener.uxflowScreenshots.get(Long.valueOf(j2));
            if (c09530e4 != null) {
                this.uxEvent = (C1KP) c09530e4.A00;
                this.bitmap = (Bitmap) c09530e4.A01;
            }
            Bitmap bitmap = this.bitmap;
            this.bitmap = bitmap == null ? ScreenshotQPLListener.INSTANCE.takeScreenshot() : bitmap;
        }

        public final void setStep(String str) {
            C14360o3.A0B(str, 0);
            this.step = str;
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final String getStep() {
            return this.step;
        }

        public final long getTimespent() {
            return this.timespent;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final C1KP getUxEvent() {
            return this.uxEvent;
        }

        public final void setBitmap(Bitmap bitmap) {
            this.bitmap = bitmap;
        }

        public final void setUxEvent(C1KP c1kp) {
            this.uxEvent = c1kp;
        }
    }

    @Override // X.C0Xc
    public String getName() {
        return "QPL_Screenshot";
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public void onMarkerDrop(C0XX c0xx) {
        C14360o3.A0B(c0xx, 0);
        endRecording(c0xx, "marker_dropped");
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public void onMarkerPoint(C0XX c0xx, String str, C0XJ c0xj, long j, long j2, boolean z, int i) {
        List list;
        Set set;
        AbstractC167017dG.A1N(c0xx, str);
        if ((c0xx.BUj() != 3359 && (set = (Set) AbstractC166997dE.A0m(pointsAllowList, c0xx.getMarkerId())) != null && !set.contains(str)) || (list = (List) cache.get(c0xx)) == null) {
            return;
        }
        list.add(new ScreenshotData(str, j - c0xx.BUq(), j));
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public void onMarkerStart(C0XX c0xx) {
        C14360o3.A0B(c0xx, 0);
        cache.put(c0xx, AbstractC16960so.A1N(new ScreenshotData("start", 0L, c0xx.BUq())));
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public void onMarkerStop(C0XX c0xx) {
        C14360o3.A0B(c0xx, 0);
        endRecording(c0xx, AnonymousClass001.A0R("stop_", AbstractC07060Yy.A00(c0xx.AYZ())));
    }

    public final void setActivity(Activity activity) {
        C14360o3.A0B(activity, 0);
        activityRef = AbstractC25225BEi.A16(activity);
    }

    private final void endRecording(C0XX c0xx, String str) {
        HashMap hashMap = cache;
        List list = (List) hashMap.get(c0xx);
        if (list != null) {
            list.add(new ScreenshotData(str, c0xx.Azm(), c0xx.Azm() + c0xx.BUq()));
        }
        List list2 = (List) hashMap.get(c0xx);
        if (list2 != null) {
            AbstractC166987dD.A1Z(new ScreenshotQPLListener$endRecording$1$1(c0xx, list2, null), AbstractC167017dG.A0w(C12L.A00, 1562465960));
        }
        hashMap.remove(c0xx);
    }

    private final void saveBitmapToDisk(Bitmap bitmap, File file, String str) {
        File file2 = new File(file, str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            C0fK.A02(Bitmap.CompressFormat.JPEG, bitmap, fileOutputStream, 60);
            fileOutputStream.flush();
            fileOutputStream.close();
            file2.getAbsolutePath();
        } catch (IOException e) {
            file2.getAbsolutePath();
            e.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap takeScreenshot() {
        Activity activity = (Activity) activityRef.get();
        if (activity == null) {
            return null;
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        View A08 = AbstractC43592JPx.A08(activity);
        C14360o3.A07(A08);
        Bitmap createBitmap = Bitmap.createBitmap(point.x, point.y, Bitmap.Config.ARGB_4444);
        C14360o3.A07(createBitmap);
        Canvas A06 = AbstractC43592JPx.A06(createBitmap);
        TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{R.attr.windowBackground});
        C14360o3.A07(obtainStyledAttributes);
        activity.getResources().getDrawable(obtainStyledAttributes.getResourceId(0, 0)).draw(A06);
        A08.draw(A06);
        return createBitmap;
    }

    @Override // X.C0Xc
    public C06650Xb getListenerMarkers() {
        int[] iArr = markers;
        return new C06650Xb(Arrays.copyOf(iArr, iArr.length), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveToDisk(C0XX c0xx, List list) {
        String A00 = AbstractC61879RvB.A00(c0xx.getMarkerId());
        File A002 = C0eT.A00(Environment.DIRECTORY_PICTURES);
        C14360o3.A07(A002);
        File file = new File(A002, "qpl_screenshots");
        file.mkdirs();
        Bitmap bitmap = ((ScreenshotData) AbstractC001800i.A0K(list)).bitmap;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int size = list.size() * width;
            int i = height + 500;
            Bitmap.Config config = bitmap.getConfig();
            C14360o3.A0A(config);
            Bitmap createBitmap = Bitmap.createBitmap(size, i, config);
            C14360o3.A07(createBitmap);
            Canvas A06 = AbstractC43592JPx.A06(createBitmap);
            TextPaint textPaint = new TextPaint();
            textPaint.setColor(-1);
            Paint.Style style = Paint.Style.FILL;
            textPaint.setStyle(style);
            textPaint.setTextSize(100.0f);
            A06.drawText(A00, 110.0f, 110.0f, textPaint);
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setColor(-1);
            textPaint2.setStyle(style);
            textPaint2.setTextSize(70.0f);
            TextPaint textPaint3 = new TextPaint();
            textPaint3.setColor(-1);
            textPaint3.setStyle(style);
            textPaint3.setTextSize(60.0f);
            TextPaint textPaint4 = new TextPaint();
            textPaint4.setColor(-1);
            textPaint4.setStyle(style);
            textPaint4.setTextSize(40.0f);
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                ScreenshotData screenshotData = (ScreenshotData) obj;
                float f = (i2 * width) + 10.0f;
                float textSize = textPaint.getTextSize() + 10.0f + textPaint2.getTextSize() + 10.0f;
                A06.drawText(AnonymousClass001.A0A(screenshotData.timespent, "ms"), f, textSize, textPaint2);
                float textSize2 = textSize + 10.0f + textPaint3.getTextSize() + 10.0f;
                A06.drawText(screenshotData.step, f, textSize2, textPaint3);
                float f2 = textSize2 + 10.0f;
                Bitmap bitmap2 = screenshotData.bitmap;
                if (bitmap2 != null) {
                    A06.drawBitmap(bitmap2, i2 * width, f2, (Paint) null);
                    C1KP c1kp = screenshotData.uxEvent;
                    if (c1kp != null) {
                        String obj2 = c1kp.toString();
                        StaticLayout build = StaticLayout.Builder.obtain(obj2, 0, obj2.length(), textPaint4, width).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(true).build();
                        C14360o3.A07(build);
                        A06.save();
                        A06.translate(f, f2 + bitmap2.getHeight() + 10.0f);
                        build.draw(A06);
                        A06.restore();
                    }
                }
                i2 = i3;
            }
            saveBitmapToDisk(createBitmap, file, AnonymousClass001.A0R(A00, ".jpg"));
        }
    }

    /* renamed from: com.instagram.debug.devoptions.debughead.util.ScreenshotQPLListener$2, reason: invalid class name */
    /* loaded from: classes8.dex */
    public final class AnonymousClass2 extends C0YY implements InterfaceC16660sJ {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        public final void invoke(C1KP c1kp) {
            C14360o3.A0B(c1kp, 0);
            Bitmap takeScreenshot = ScreenshotQPLListener.INSTANCE.takeScreenshot();
            if (takeScreenshot != null) {
                ScreenshotQPLListener.uxflowScreenshots.put(Long.valueOf(c1kp.A00), AbstractC166987dD.A1L(c1kp, takeScreenshot));
            }
        }

        @Override // X.InterfaceC16660sJ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C1KP) obj);
            return C0eB.A00;
        }
    }
}
