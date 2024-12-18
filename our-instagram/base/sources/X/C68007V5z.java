package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.util.Base64;
import android.widget.ImageView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.V5z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68007V5z extends IgImageView {
    public static final InterfaceC11380iw A06 = new C19270xB("ig_react_image_view");
    public android.net.Uri A00;
    public float A01;
    public ImageView.ScaleType A02;
    public boolean A03;
    public final Map A04;
    public final Rect A05;

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    private void setUriFromSingleSource(String str) {
        android.net.Uri uri;
        if (str != null) {
            try {
                if (str.startsWith("data:image/png;base64,")) {
                    byte[] decode = Base64.decode(str.replace("data:image/png;base64,", ""), 0);
                    setImageDrawable(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(decode, 0, decode.length)));
                    return;
                } else {
                    android.net.Uri A03 = AbstractC08820cl.A03(str);
                    this.A00 = A03;
                    if (A03.getScheme() == null) {
                        this.A00 = null;
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (this.A00 == null) {
            Context context = getContext();
            if (str != null && !str.isEmpty()) {
                uri = new Uri.Builder().scheme(AbstractC58317Pt9.A00(83)).authority(context.getPackageName()).path(String.valueOf(SXn.A01.A00(context, str))).build();
            } else {
                uri = null;
            }
            this.A00 = uri;
        }
    }

    public final void A0H() {
        String str;
        if (this.A03) {
            Map map = this.A04;
            if (map.size() > 1 && (getWidth() <= 0 || getHeight() <= 0)) {
                return;
            }
            this.A00 = null;
            if (!map.isEmpty()) {
                if (map.size() > 1) {
                    double width = getWidth() * getHeight();
                    Iterator A15 = AbstractC166997dE.A15(map);
                    double d = Double.MAX_VALUE;
                    str = null;
                    while (A15.hasNext()) {
                        Map.Entry entry = (Map.Entry) A15.next();
                        double abs = Math.abs(1.0d - (((Number) entry.getValue()).doubleValue() / width));
                        if (abs < d) {
                            str = (String) entry.getKey();
                            d = abs;
                        }
                    }
                } else {
                    str = (String) AbstractC43593JPy.A12(map).next();
                }
                setUriFromSingleSource(str);
            }
            if (this.A00 == null) {
                return;
            }
            setScaleType(this.A02);
            boolean equals = AbstractC58317Pt9.A00(83).equals(this.A00.getScheme());
            android.net.Uri uri = this.A00;
            if (equals) {
                setImageURI(uri);
            } else {
                C14360o3.A0B(uri, 0);
                setUrl(AbstractC81033jX.A00(uri, -1, -1), A06);
            }
            this.A03 = false;
        }
    }

    public void setBorderRadius(float f) {
        if (!C62795SRp.A00(this.A01, f)) {
            this.A01 = f;
            this.A03 = true;
        }
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C73053Pg c73053Pg;
        Drawable drawable2 = drawable;
        if (this.A01 > 0.0f) {
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (bitmap != null) {
                    c73053Pg = new C73053Pg(bitmap, false);
                } else {
                    c73053Pg = null;
                }
                setImageDrawable(c73053Pg);
                return;
            }
            boolean z = drawable instanceof ColorDrawable;
            drawable2 = drawable;
            if (z) {
                int color = ((ColorDrawable) drawable).getColor();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(color);
                gradientDrawable.setShape(1);
                drawable2 = gradientDrawable;
            }
        }
        super.setImageDrawable(drawable2);
    }

    public void setScaleTypeNoUpdate(ImageView.ScaleType scaleType) {
        this.A02 = scaleType;
        this.A03 = true;
    }

    public void setShouldNotifyLoadEvents(boolean z) {
        C70823Whg c70823Whg;
        if (!z) {
            c70823Whg = null;
        } else {
            X9J A05 = UIManagerHelper.A05((Q21) getContext(), getId());
            if (A05 == null) {
                return;
            }
            setRequestStartListener(new C70824Whh(A05, this));
            c70823Whg = new C70823Whg(2, A05, this);
        }
        this.A0E = c70823Whg;
    }

    public void setSource(ReadableArray readableArray) {
        String string;
        String string2;
        Map map = this.A04;
        map.clear();
        if (readableArray != null && readableArray.size() != 0) {
            if (readableArray.size() == 1) {
                ReadableMap map2 = readableArray.getMap(0);
                if (map2 != null && (string2 = map2.getString("uri")) != null) {
                    map.put(string2, Double.valueOf(0.0d));
                }
            } else {
                for (int i = 0; i < readableArray.size(); i++) {
                    ReadableMap map3 = readableArray.getMap(i);
                    if (map3 != null && (string = map3.getString("uri")) != null) {
                        map.put(string, Double.valueOf(map3.getDouble(IgReactMediaPickerNativeModule.WIDTH) * map3.getDouble(IgReactMediaPickerNativeModule.HEIGHT)));
                    }
                }
            }
        }
        this.A03 = true;
    }

    public C68007V5z(Context context) {
        super(context);
        this.A05 = new Rect();
        this.A04 = new HashMap();
        this.A02 = ImageView.ScaleType.CENTER_CROP;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int A03 = C0f9.A03(905192558);
        Rect rect = this.A05;
        getDrawingRect(rect);
        canvas.clipRect(rect);
        super.draw(canvas);
        C0f9.A0A(-1623677008, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r4.A04.size() > 1) goto L9;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSizeChanged(int r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            r0 = 426378489(0x196a04f9, float:1.2098521E-23)
            int r3 = X.C0f9.A06(r0)
            super.onSizeChanged(r5, r6, r7, r8)
            if (r5 <= 0) goto L22
            if (r6 <= 0) goto L22
            boolean r0 = r4.A03
            if (r0 != 0) goto L1c
            java.util.Map r0 = r4.A04
            int r2 = r0.size()
            r1 = 1
            r0 = 0
            if (r2 <= r1) goto L1d
        L1c:
            r0 = 1
        L1d:
            r4.A03 = r0
            r4.A0H()
        L22:
            r0 = 606502433(0x24267e21, float:3.6102347E-17)
            X.C0f9.A0D(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68007V5z.onSizeChanged(int, int, int, int):void");
    }
}
