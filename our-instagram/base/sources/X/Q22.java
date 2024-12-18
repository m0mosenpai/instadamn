package X;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.content.res.loader.ResourcesLoader;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes10.dex */
public final class Q22 extends Resources {
    public boolean A00;
    public final Resources A01;
    public final InterfaceC65373Tj5 A02;
    public final Map A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q22(AssetManager assetManager, Configuration configuration, Resources resources, DisplayMetrics displayMetrics, InterfaceC65373Tj5 interfaceC65373Tj5, Map map) {
        super(assetManager, displayMetrics, configuration);
        AbstractC25229BEm.A1I(interfaceC65373Tj5, 2, map);
        this.A01 = resources;
        this.A02 = interfaceC65373Tj5;
        this.A03 = map;
    }

    @Override // android.content.res.Resources
    public final void addLoaders(ResourcesLoader... resourcesLoaderArr) {
        C14360o3.A0B(resourcesLoaderArr, 0);
        this.A01.addLoaders((ResourcesLoader[]) Arrays.copyOf(resourcesLoaderArr, resourcesLoaderArr.length));
    }

    @Override // android.content.res.Resources
    public final String getString(int i, Object... objArr) {
        C14360o3.A0B(objArr, 1);
        String string = this.A01.getString(i, Arrays.copyOf(objArr, objArr.length));
        C14360o3.A07(string);
        return string;
    }

    @Override // android.content.res.Resources
    public final CharSequence getText(int i, CharSequence charSequence) {
        return A00(new BFI(i, 1, this, charSequence), i);
    }

    @Override // android.content.res.Resources
    public final void removeLoaders(ResourcesLoader... resourcesLoaderArr) {
        C14360o3.A0B(resourcesLoaderArr, 0);
        this.A01.removeLoaders((ResourcesLoader[]) Arrays.copyOf(resourcesLoaderArr, resourcesLoaderArr.length));
    }

    private final CharSequence A00(InterfaceC16820sZ interfaceC16820sZ, int i) {
        CharSequence AXO;
        String str = (String) AbstractC166997dE.A0m(this.A03, i);
        if (str == null || (AXO = this.A02.AXO(str)) == null) {
            return (CharSequence) interfaceC16820sZ.invoke();
        }
        return AXO;
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getAnimation(int i) {
        XmlResourceParser animation = this.A01.getAnimation(i);
        C14360o3.A07(animation);
        return animation;
    }

    @Override // android.content.res.Resources
    public final boolean getBoolean(int i) {
        return this.A01.getBoolean(i);
    }

    @Override // android.content.res.Resources
    public final int getColor(int i, Resources.Theme theme) {
        return this.A01.getColor(i, theme);
    }

    @Override // android.content.res.Resources
    public final ColorStateList getColorStateList(int i, Resources.Theme theme) {
        ColorStateList colorStateList = this.A01.getColorStateList(i, theme);
        C14360o3.A07(colorStateList);
        return colorStateList;
    }

    @Override // android.content.res.Resources
    public final Configuration getConfiguration() {
        Configuration configuration = this.A01.getConfiguration();
        C14360o3.A07(configuration);
        return configuration;
    }

    @Override // android.content.res.Resources
    public final float getDimension(int i) {
        return this.A01.getDimension(i);
    }

    @Override // android.content.res.Resources
    public final int getDimensionPixelOffset(int i) {
        return this.A01.getDimensionPixelOffset(i);
    }

    @Override // android.content.res.Resources
    public final int getDimensionPixelSize(int i) {
        return this.A01.getDimensionPixelSize(i);
    }

    @Override // android.content.res.Resources
    public final DisplayMetrics getDisplayMetrics() {
        DisplayMetrics displayMetrics = this.A01.getDisplayMetrics();
        C14360o3.A07(displayMetrics);
        return displayMetrics;
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawable(int i, Resources.Theme theme) {
        Drawable drawable = this.A01.getDrawable(i, theme);
        C14360o3.A07(drawable);
        return drawable;
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawableForDensity(int i, int i2) {
        return this.A01.getDrawableForDensity(i, i2);
    }

    @Override // android.content.res.Resources
    public final float getFloat(int i) {
        return this.A01.getFloat(i);
    }

    @Override // android.content.res.Resources
    public final Typeface getFont(int i) {
        Typeface font = this.A01.getFont(i);
        C14360o3.A07(font);
        return font;
    }

    @Override // android.content.res.Resources
    public final float getFraction(int i, int i2, int i3) {
        return this.A01.getFraction(i, i2, i3);
    }

    @Override // android.content.res.Resources
    public final int getIdentifier(String str, String str2, String str3) {
        return this.A01.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public final int[] getIntArray(int i) {
        int[] intArray = this.A01.getIntArray(i);
        C14360o3.A07(intArray);
        return intArray;
    }

    @Override // android.content.res.Resources
    public final int getInteger(int i) {
        return this.A01.getInteger(i);
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getLayout(int i) {
        XmlResourceParser layout = this.A01.getLayout(i);
        C14360o3.A07(layout);
        return layout;
    }

    @Override // android.content.res.Resources
    public final Movie getMovie(int i) {
        Movie movie = this.A01.getMovie(i);
        C14360o3.A07(movie);
        return movie;
    }

    @Override // android.content.res.Resources
    public final String getQuantityString(int i, int i2) {
        String quantityString = this.A01.getQuantityString(i, i2);
        C14360o3.A07(quantityString);
        return quantityString;
    }

    @Override // android.content.res.Resources
    public final CharSequence getQuantityText(int i, int i2) {
        CharSequence quantityText = this.A01.getQuantityText(i, i2);
        C14360o3.A07(quantityText);
        return quantityText;
    }

    @Override // android.content.res.Resources
    public final String getResourceEntryName(int i) {
        String resourceEntryName = this.A01.getResourceEntryName(i);
        C14360o3.A07(resourceEntryName);
        return resourceEntryName;
    }

    @Override // android.content.res.Resources
    public final String getResourceName(int i) {
        String resourceName = this.A01.getResourceName(i);
        C14360o3.A07(resourceName);
        return resourceName;
    }

    @Override // android.content.res.Resources
    public final String getResourcePackageName(int i) {
        String resourcePackageName = this.A01.getResourcePackageName(i);
        C14360o3.A07(resourcePackageName);
        return resourcePackageName;
    }

    @Override // android.content.res.Resources
    public final String getResourceTypeName(int i) {
        String resourceTypeName = this.A01.getResourceTypeName(i);
        C14360o3.A07(resourceTypeName);
        return resourceTypeName;
    }

    @Override // android.content.res.Resources
    public final String[] getStringArray(int i) {
        String[] stringArray = this.A01.getStringArray(i);
        C14360o3.A07(stringArray);
        return stringArray;
    }

    @Override // android.content.res.Resources
    public final CharSequence[] getTextArray(int i) {
        CharSequence[] textArray = this.A01.getTextArray(i);
        C14360o3.A07(textArray);
        return textArray;
    }

    @Override // android.content.res.Resources
    public final void getValue(int i, TypedValue typedValue, boolean z) {
        this.A01.getValue(i, typedValue, z);
    }

    @Override // android.content.res.Resources
    public final void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        this.A01.getValueForDensity(i, i2, typedValue, z);
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getXml(int i) {
        XmlResourceParser xml = this.A01.getXml(i);
        C14360o3.A07(xml);
        return xml;
    }

    @Override // android.content.res.Resources
    public final TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        TypedArray obtainAttributes = this.A01.obtainAttributes(attributeSet, iArr);
        C14360o3.A07(obtainAttributes);
        return obtainAttributes;
    }

    @Override // android.content.res.Resources
    public final TypedArray obtainTypedArray(int i) {
        TypedArray obtainTypedArray = this.A01.obtainTypedArray(i);
        C14360o3.A07(obtainTypedArray);
        return obtainTypedArray;
    }

    @Override // android.content.res.Resources
    public final InputStream openRawResource(int i, TypedValue typedValue) {
        InputStream openRawResource = this.A01.openRawResource(i, typedValue);
        C14360o3.A07(openRawResource);
        return openRawResource;
    }

    @Override // android.content.res.Resources
    public final AssetFileDescriptor openRawResourceFd(int i) {
        AssetFileDescriptor openRawResourceFd = this.A01.openRawResourceFd(i);
        C14360o3.A07(openRawResourceFd);
        return openRawResourceFd;
    }

    @Override // android.content.res.Resources
    public final void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.A01.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public final void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.A01.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public final void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        try {
            this.A01.updateConfiguration(configuration, displayMetrics);
            this.A00 = true;
        } catch (NullPointerException unused) {
            AbstractC167007dF.A0J().post(new RunnableC64693TPy(configuration, displayMetrics, this));
        }
    }

    @Override // android.content.res.Resources
    public final int getColor(int i) {
        return this.A01.getColor(i);
    }

    @Override // android.content.res.Resources
    public final ColorStateList getColorStateList(int i) {
        ColorStateList colorStateList = this.A01.getColorStateList(i);
        C14360o3.A07(colorStateList);
        return colorStateList;
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawable(int i) {
        Drawable drawable = this.A01.getDrawable(i);
        C14360o3.A07(drawable);
        return drawable;
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return this.A01.getDrawableForDensity(i, i2, theme);
    }

    @Override // android.content.res.Resources
    public final String getQuantityString(int i, int i2, Object... objArr) {
        C14360o3.A0B(objArr, 2);
        String quantityString = this.A01.getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
        C14360o3.A07(quantityString);
        return quantityString;
    }

    @Override // android.content.res.Resources
    public final String getString(int i) {
        return A00(new C57249PbX(i, 7, this), i).toString();
    }

    @Override // android.content.res.Resources
    public final CharSequence getText(int i) {
        return A00(new C57249PbX(i, 8, this), i);
    }

    @Override // android.content.res.Resources
    public final void getValue(String str, TypedValue typedValue, boolean z) {
        this.A01.getValue(str, typedValue, z);
    }

    @Override // android.content.res.Resources
    public final InputStream openRawResource(int i) {
        InputStream openRawResource = this.A01.openRawResource(i);
        C14360o3.A07(openRawResource);
        return openRawResource;
    }
}
