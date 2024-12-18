package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes11.dex */
public final class UA6 extends MenuInflater {
    public static final Class[] A04;
    public static final Class[] A05;
    public Context A00;
    public Object A01;
    public final Object[] A02;
    public final Object[] A03;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0588, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0437  */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01(android.util.AttributeSet r47, android.view.Menu r48, org.xmlpull.v1.XmlPullParser r49) {
        /*
            Method dump skipped, instructions count: 1453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UA6.A01(android.util.AttributeSet, android.view.Menu, org.xmlpull.v1.XmlPullParser):void");
    }

    static {
        Class[] clsArr = {Context.class};
        A05 = clsArr;
        A04 = clsArr;
    }

    private Object A00(Object obj) {
        if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            return A00(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof C02J)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            try {
                xmlResourceParser = this.A00.getResources().getLayout(i);
                AttributeSet asAttributeSet = android.util.Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof WQH) {
                    WQH wqh = (WQH) menu;
                    if (!wqh.A0D) {
                        wqh.A06();
                        z = true;
                    }
                }
                A01(asAttributeSet, menu, xmlResourceParser);
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
            }
        } finally {
            if (z) {
                ((WQH) menu).A05();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    public UA6(Context context) {
        super(context);
        this.A00 = context;
        Object[] objArr = {context};
        this.A03 = objArr;
        this.A02 = objArr;
    }
}
