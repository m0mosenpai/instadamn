package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.2iM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC56322iM extends View {
    public int A00;
    public Context A01;
    public C3O8 A02;
    public String A03;
    public HashMap A04;
    public int[] A05;
    public String A06;

    public static int A00(AbstractC56322iM abstractC56322iM, ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str != null && (resources = abstractC56322iM.A01.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    String str2 = null;
                    try {
                        str2 = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                    }
                    if (str.equals(str2)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public void A09(ConstraintLayout container) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    public void setReferencedIds(int[] ids) {
        this.A03 = null;
        this.A00 = 0;
        for (int i : ids) {
            A01(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r2 != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        if (r2 == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005a, code lost:
    
        if (r4 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02(java.lang.String r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L95
            int r0 = r8.length()
            if (r0 == 0) goto L95
            android.content.Context r6 = r7.A01
            if (r6 == 0) goto L95
            java.lang.String r3 = r8.trim()
            android.view.ViewParent r0 = r7.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r0 == 0) goto L1b
            r7.getParent()
        L1b:
            android.view.ViewParent r0 = r7.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r5 = 0
            if (r0 == 0) goto L5d
            android.view.ViewParent r4 = r7.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
        L2a:
            boolean r0 = r7.isInEditMode()
            r2 = 0
            if (r0 == 0) goto L5a
            if (r4 == 0) goto L5f
            if (r3 == 0) goto L58
            java.util.HashMap r0 = r4.A0F
            if (r0 == 0) goto L58
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L58
            java.util.HashMap r0 = r4.A0F
            java.lang.Object r1 = r0.get(r3)
        L45:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L51
            java.lang.Number r1 = (java.lang.Number) r1
            int r2 = r1.intValue()
            if (r2 != 0) goto L89
        L51:
            int r2 = A00(r7, r4, r3)
            if (r2 != 0) goto L89
            goto L5f
        L58:
            r1 = 0
            goto L45
        L5a:
            if (r4 == 0) goto L5f
            goto L51
        L5d:
            r4 = r5
            goto L2a
        L5f:
            java.lang.Class<X.3O5> r0 = X.C3O5.class
            java.lang.reflect.Field r0 = r0.getField(r3)     // Catch: java.lang.Exception -> L69
            int r2 = r0.getInt(r5)     // Catch: java.lang.Exception -> L69
        L69:
            if (r2 != 0) goto L89
            android.content.res.Resources r2 = r6.getResources()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "id"
            int r2 = r2.getIdentifier(r3, r0, r1)
            if (r2 != 0) goto L89
            java.lang.String r1 = "Could not find id of \""
            java.lang.String r0 = "\""
            java.lang.String r1 = X.AnonymousClass001.A0g(r1, r3, r0)
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r1)
            return
        L89:
            java.util.HashMap r1 = r7.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.put(r0, r3)
            r7.A01(r2)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC56322iM.A02(java.lang.String):void");
    }

    private void A03(String tagString) {
        if (tagString != null && tagString.length() != 0 && this.A01 != null) {
            String trim = tagString.trim();
            ViewGroup viewGroup = null;
            if (getParent() instanceof ConstraintLayout) {
                viewGroup = (ViewGroup) getParent();
            }
            if (viewGroup == null) {
                android.util.Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof C56302iJ) && trim.equals(((C56302iJ) layoutParams).A0y)) {
                    if (childAt.getId() == -1) {
                        android.util.Log.w("ConstraintHelper", AnonymousClass001.A0g("to use ConstraintTag view ", childAt.getClass().getSimpleName(), " must have an ID"));
                    } else {
                        A01(childAt.getId());
                    }
                }
            }
        }
    }

    public final void A04() {
        if (this.A02 != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof C56302iJ) {
                ((C56302iJ) layoutParams).A0x = (C56082hw) this.A02;
            }
        }
    }

    public void A06(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, AbstractC56282iH.A01);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.A03 = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.A06 = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        if (r2 == 6) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r2 == 6) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A07(X.C56082hw r4, boolean r5) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof androidx.constraintlayout.widget.Barrier
            if (r0 == 0) goto L1a
            r0 = r3
            androidx.constraintlayout.widget.Barrier r0 = (androidx.constraintlayout.widget.Barrier) r0
            int r2 = r0.A00
            r1 = 6
            r0 = 5
            if (r5 == 0) goto L1b
            if (r2 == r0) goto L1f
            if (r2 != r1) goto L12
        L11:
            r2 = 0
        L12:
            boolean r0 = r4 instanceof X.C3O6
            if (r0 == 0) goto L1a
            X.3O6 r4 = (X.C3O6) r4
            r4.A00 = r2
        L1a:
            return
        L1b:
            if (r2 == r0) goto L11
            if (r2 != r1) goto L12
        L1f:
            r2 = 1
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC56322iM.A07(X.2hw, boolean):void");
    }

    public void A08(ConstraintLayout container) {
        if (this instanceof C3OJ) {
            A0A(container);
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.A05, this.A00);
    }

    public void setIds(String idList) {
        this.A03 = idList;
        if (idList != null) {
            int i = 0;
            this.A00 = 0;
            while (true) {
                int indexOf = idList.indexOf(44, i);
                if (indexOf == -1) {
                    A02(idList.substring(i));
                    return;
                } else {
                    A02(idList.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String tagList) {
        this.A06 = tagList;
        if (tagList != null) {
            int i = 0;
            this.A00 = 0;
            while (true) {
                int indexOf = tagList.indexOf(44, i);
                if (indexOf == -1) {
                    A03(tagList.substring(i));
                    return;
                } else {
                    A03(tagList.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public AbstractC56322iM(Context context) {
        super(context);
        this.A05 = new int[32];
        this.A04 = new HashMap();
        this.A01 = context;
        A06(null);
    }

    private void A01(int id) {
        if (id != getId()) {
            int i = this.A00 + 1;
            int[] iArr = this.A05;
            int length = iArr.length;
            if (i > length) {
                iArr = Arrays.copyOf(iArr, length * 2);
                this.A05 = iArr;
            }
            int i2 = this.A00;
            iArr[i2] = id;
            this.A00 = i2 + 1;
        }
    }

    public final void A05() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            A0A((ConstraintLayout) parent);
        }
    }

    public final void A0A(ConstraintLayout container) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.A00; i++) {
            View view = (View) container.A08.get(this.A05[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        int A06 = C0f9.A06(1786512111);
        super.onAttachedToWindow();
        String str = this.A03;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.A06;
        if (str2 != null) {
            setReferenceTags(str2);
        }
        C0f9.A0D(-239184327, A06);
    }

    @Override // android.view.View
    public final void setTag(int key, Object tag) {
        super.setTag(key, tag);
        if (tag == null && this.A03 == null) {
            A01(key);
        }
    }

    public AbstractC56322iM(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.A05 = new int[32];
        this.A04 = new HashMap();
        this.A01 = context;
        A06(attrs);
    }

    public AbstractC56322iM(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.A05 = new int[32];
        this.A04 = new HashMap();
        this.A01 = context;
        A06(attrs);
    }
}
