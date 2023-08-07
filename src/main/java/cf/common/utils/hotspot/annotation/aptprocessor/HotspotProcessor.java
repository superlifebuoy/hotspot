package cf.common.utils.hotspot.annotation.aptprocessor;

import com.sun.tools.javac.api.JavacTrees;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;

@SupportedAnnotationTypes({ "cf.common.utils.hotspot.annotation.Hotspot" })
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class HotspotProcessor extends AbstractProcessor {

	@Override
	public synchronized void init(ProcessingEnvironment processingEnv) {
	}

	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * attributes
	 */
	private JavacTrees trees;
}
