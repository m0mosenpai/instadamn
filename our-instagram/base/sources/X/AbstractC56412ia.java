package X;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.Pair;
import com.facebook.common.stringformat.StringFormatUtil;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.2ia, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC56412ia {
    public static final C56422ib A00 = new C56422ib();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x00b9. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.2mO, android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.graphics.drawable.StateListDrawable, android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.util.AttributeSet, android.content.res.XmlResourceParser, org.xmlpull.v1.XmlPullParser, android.content.res.TypedArray] */
    public static final Pair A01(Resources resources, int i) {
        int next;
        ?? c58652mO;
        Drawable drawable;
        String str;
        char charAt;
        C56422ib c56422ib = A00;
        String string = resources.getString(i);
        if (string.startsWith("R|")) {
            Drawable A002 = C56422ib.A00(resources, C56422ib.A02(string, i), c56422ib);
            return new Pair(A002, A002.getConstantState());
        }
        int length = string.length();
        boolean z = false;
        if (length == 7 && string.charAt(0) == 'I') {
            z = true;
        }
        if (z) {
            return new Pair(null, AbstractC56442id.A00.A00(Integer.parseInt(string.substring(1, 3), 16), Integer.parseInt(string.substring(3, 7), 16)));
        }
        boolean z2 = false;
        if (length == 17 && ((charAt = string.charAt(0)) == 'F' || charAt == 'T')) {
            z2 = true;
        }
        if (z2) {
            char charAt2 = string.charAt(0);
            int parseInt = Integer.parseInt(string.substring(1, 9), 16);
            int parseInt2 = Integer.parseInt(string.substring(9, 17), 16);
            if (charAt2 == 'F') {
                resources.getDrawable(parseInt, null);
                resources.getDrawable(parseInt2, null);
                str = "FBIcon state list drawables are not supported in Instagram!";
            } else {
                str = "FB Themed drawables are not supported in Instagram! Please use ig_android_resource instead of remoteable_resource and better_resource.";
            }
            throw S5G.A00(str, i);
        }
        try {
            ?? xml = resources.getXml(i);
            do {
                next = xml.next();
                if (next == 2) {
                    String name = xml.getName();
                    try {
                        switch (name.hashCode()) {
                            case -1900499203:
                                if (name.equals("app-redrawable")) {
                                    c58652mO = C56422ib.A00(resources, C56422ib.A01(resources, xml, i), c56422ib);
                                    drawable = c58652mO;
                                    return new Pair(drawable, drawable.getConstantState());
                                }
                                throw new XmlPullParserException(AnonymousClass001.A0g(xml.getPositionDescription(), ": invalid drawable tag ", name));
                            case -1264384066:
                                if (name.equals("app-ikon-drawable")) {
                                    TypedArray obtainAttributes = resources.obtainAttributes(xml, AbstractC55922hc.A1a);
                                    try {
                                        Drawable.ConstantState A003 = AbstractC56442id.A00.A00(obtainAttributes.getInt(0, 0), obtainAttributes.getInt(1, 0));
                                        obtainAttributes.recycle();
                                        return new Pair(null, A003);
                                    } finally {
                                        obtainAttributes.recycle();
                                    }
                                }
                                throw new XmlPullParserException(AnonymousClass001.A0g(xml.getPositionDescription(), ": invalid drawable tag ", name));
                            case -1235288628:
                                if (name.equals("app-remoteable")) {
                                    TypedArray obtainAttributes2 = resources.obtainAttributes(xml, AbstractC55922hc.A1y);
                                    int resourceId = obtainAttributes2.getResourceId(1, 0);
                                    int resourceId2 = obtainAttributes2.getResourceId(2, 0);
                                    String string2 = obtainAttributes2.getString(0);
                                    if (string2 != null) {
                                        Boolean bool = (Boolean) c56422ib.A01.A00.get(string2);
                                        if (bool != null) {
                                            boolean booleanValue = bool.booleanValue();
                                            if (booleanValue) {
                                                c58652mO = resources.getDrawable(resourceId2, null);
                                            } else {
                                                c58652mO = resources.getDrawable(resourceId, null);
                                            }
                                            if (c58652mO == 0) {
                                                if (!booleanValue) {
                                                    resourceId2 = resourceId;
                                                }
                                                throw new Resources.NotFoundException(StringFormatUtil.formatStrLocaleSafe("Could not find drawable: %d", Integer.valueOf(resourceId2)));
                                            }
                                            drawable = c58652mO;
                                            return new Pair(drawable, drawable.getConstantState());
                                        }
                                        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Experiment key not found: %s", string2);
                                        C14360o3.A07(formatStrLocaleSafe);
                                        throw new IllegalArgumentException(formatStrLocaleSafe);
                                    }
                                    throw new Resources.NotFoundException(StringFormatUtil.formatStrLocaleSafe("Could not get qe name for: %d", Integer.valueOf(i)));
                                }
                                throw new XmlPullParserException(AnonymousClass001.A0g(xml.getPositionDescription(), ": invalid drawable tag ", name));
                            case -1042228540:
                                if (name.equals("app-themed-drawable")) {
                                    TypedArray obtainAttributes3 = resources.obtainAttributes(xml, AbstractC55922hc.A0Q);
                                    obtainAttributes3.getResourceId(1, 0);
                                    obtainAttributes3.getResourceId(0, 0);
                                    throw S5G.A00("FB Themed drawables are not supported in Instagram! Please use ig_android_resource instead of remoteable_resource and better_resource.", i);
                                }
                                throw new XmlPullParserException(AnonymousClass001.A0g(xml.getPositionDescription(), ": invalid drawable tag ", name));
                            case -637965733:
                                if (name.equals("app-bitmap")) {
                                    TypedArray obtainAttributes4 = resources.obtainAttributes(xml, AbstractC55922hc.A01);
                                    int i2 = 0;
                                    int resourceId3 = obtainAttributes4.getResourceId(3, 0);
                                    int changingConfigurations = obtainAttributes4.getChangingConfigurations();
                                    int color = obtainAttributes4.getColor(4, -1);
                                    float f = obtainAttributes4.getFloat(0, 1.0f);
                                    int i3 = obtainAttributes4.getInt(2, 119);
                                    boolean z3 = obtainAttributes4.getBoolean(1, false);
                                    obtainAttributes4.recycle();
                                    drawable = null;
                                    drawable = null;
                                    if (resourceId3 != 0 && (c58652mO = resources.getDrawable(resourceId3, null)) != 0) {
                                        if (changingConfigurations != 0 || f != 1.0f || color != 0 || z3 || i3 != 119) {
                                            c58652mO.mutate();
                                            if (changingConfigurations != 0) {
                                                c58652mO.setChangingConfigurations(changingConfigurations);
                                            }
                                            if (f < 1.0f) {
                                                if (f > 0.0f) {
                                                    i2 = (int) ((f * 255.0f) + 0.5f);
                                                }
                                                c58652mO.setAlpha(i2);
                                            }
                                            if (color != 0) {
                                                c58652mO.setColorFilter(color, PorterDuff.Mode.SRC_IN);
                                            }
                                            if (z3) {
                                                c58652mO.setAutoMirrored(z3);
                                            }
                                            if (i3 != 119) {
                                                if (c58652mO instanceof InterfaceC56802jD) {
                                                    ((InterfaceC56802jD) c58652mO).EV6(i3);
                                                } else if (c58652mO instanceof BitmapDrawable) {
                                                    ((BitmapDrawable) c58652mO).setGravity(i3);
                                                }
                                            }
                                        }
                                        drawable = c58652mO;
                                    }
                                    return new Pair(drawable, drawable.getConstantState());
                                }
                                throw new XmlPullParserException(AnonymousClass001.A0g(xml.getPositionDescription(), ": invalid drawable tag ", name));
                            case -530250655:
                                if (name.equals("app-fbicon")) {
                                    TypedArray obtainAttributes5 = resources.obtainAttributes(xml, AbstractC55922hc.A0b);
                                    Drawable drawable2 = obtainAttributes5.getDrawable(0);
                                    Drawable drawable3 = obtainAttributes5.getDrawable(1);
                                    drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                                    drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight());
                                    throw S5G.A00("FBIcon state list drawables are not supported in Instagram!", i);
                                }
                                throw new XmlPullParserException(AnonymousClass001.A0g(xml.getPositionDescription(), ": invalid drawable tag ", name));
                            case 1191572447:
                                if (name.equals("selector")) {
                                    ?? stateListDrawable = new StateListDrawable();
                                    stateListDrawable.inflate(resources, xml, xml);
                                    drawable = stateListDrawable;
                                    return new Pair(drawable, drawable.getConstantState());
                                }
                                throw new XmlPullParserException(AnonymousClass001.A0g(xml.getPositionDescription(), ": invalid drawable tag ", name));
                            case 1454686952:
                                if (name.equals("app-kf-network")) {
                                    c58652mO = new C58652mO(C58632mM.A00, new Object(), i);
                                    c58652mO.inflate(resources, xml, xml);
                                    drawable = c58652mO;
                                    return new Pair(drawable, drawable.getConstantState());
                                }
                                throw new XmlPullParserException(AnonymousClass001.A0g(xml.getPositionDescription(), ": invalid drawable tag ", name));
                            default:
                                throw new XmlPullParserException(AnonymousClass001.A0g(xml.getPositionDescription(), ": invalid drawable tag ", name));
                        }
                    } catch (Throwable th) {
                        xml.recycle();
                        throw th;
                    }
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e) {
            throw new RuntimeException(AnonymousClass001.A0R("Failed to load XML for resource: ", resources.getResourceEntryName(i)), e);
        }
    }

    public static final Drawable A00(Resources resources, int i) {
        Pair A01 = A01(resources, i);
        Drawable drawable = (Drawable) A01.first;
        if (drawable == null) {
            Drawable newDrawable = ((Drawable.ConstantState) A01.second).newDrawable(resources);
            C14360o3.A07(newDrawable);
            return newDrawable;
        }
        return drawable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (".xml".equalsIgnoreCase(r2.substring(r1 - 4)) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A02(android.content.res.Resources r5, int r6) {
        /*
            java.lang.String r2 = r5.getString(r6)
            java.lang.String r0 = "R|"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L14
            X.3PQ r4 = X.C56422ib.A02(r2, r6)
        L10:
            if (r4 != 0) goto L76
            r1 = 0
            return r1
        L14:
            int r1 = r2.length()
            r3 = 1
            r0 = 4
            if (r1 < r0) goto L2a
            int r1 = r1 - r0
            java.lang.String r1 = r2.substring(r1)
            java.lang.String r0 = ".xml"
            boolean r1 = r0.equalsIgnoreCase(r1)
            r0 = 1
            if (r1 != 0) goto L2b
        L2a:
            r0 = 0
        L2b:
            r4 = 0
            if (r0 == 0) goto L10
            android.content.res.XmlResourceParser r2 = r5.getXml(r6)     // Catch: android.content.res.Resources.NotFoundException -> L10 java.lang.Throwable -> L58
        L32:
            int r1 = r2.next()     // Catch: java.lang.Throwable -> L4c
            r0 = 2
            if (r1 == r0) goto L43
            if (r1 != r3) goto L32
            java.lang.String r1 = "No start tag found"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L4c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4c
            throw r0     // Catch: java.lang.Throwable -> L4c
        L43:
            X.3PQ r0 = X.C56422ib.A01(r5, r2, r6)     // Catch: java.lang.Throwable -> L4c
            r2.close()     // Catch: android.content.res.Resources.NotFoundException -> L10 java.lang.Throwable -> L58 java.lang.Throwable -> L58
            r4 = r0
            goto L10
        L4c:
            r1 = move-exception
            if (r2 == 0) goto L57
            r2.close()     // Catch: java.lang.Throwable -> L53
            goto L57
        L53:
            r0 = move-exception
            X.AbstractC61625Rqp.A00(r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L10 java.lang.Throwable -> L58 java.lang.Throwable -> L58
        L57:
            throw r1     // Catch: android.content.res.Resources.NotFoundException -> L10 java.lang.Throwable -> L58 java.lang.Throwable -> L58
        L58:
            r3 = move-exception
            java.lang.String r1 = r5.getResourceName(r6)     // Catch: android.content.res.Resources.NotFoundException -> L5e
            goto L60
        L5e:
            java.lang.String r1 = "not-found"
        L60:
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            java.lang.String r0 = "Could not parse ReDrawable (id=%x, name=%s)"
            java.lang.String r1 = java.lang.String.format(r2, r0, r1)
            java.lang.String r0 = "DrawableParserBase"
            X.C0K8.A0J(r0, r1, r3)
            goto L10
        L76:
            java.lang.String r1 = r4.A05
            if (r1 != 0) goto L7c
            java.lang.String r1 = r4.A04
        L7c:
            X.0kz r0 = X.C3PQ.A06
            r0.EE6(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC56412ia.A02(android.content.res.Resources, int):java.lang.String");
    }
}
